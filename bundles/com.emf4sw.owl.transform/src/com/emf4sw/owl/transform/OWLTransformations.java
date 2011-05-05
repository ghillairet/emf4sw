package com.emf4sw.owl.transform;

import static com.atl.common.models.Models.ecore;
import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.register;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;

import com.atl.common.models.Properties;
import com.atl.common.models.extensions.ATLExtensions;
import com.atl.common.trans.MultiInOneOutTransformation;
import com.atl.common.trans.OneInOneOutTransformation;
import com.atl.common.trans.Transformation;
import com.atl.common.trans.Transformations;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.resource.OWLFormats;

/**
 * {@link OWLTransformations}
 * 
 * Singleton class that contains {@link Transformation} definitions for OWL.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class OWLTransformations {

	private static final URL ecore2owlURL = OWLTransformations.class.getResource("resources/ecore2owl.asm");
	
	private static final URL ecore2owlHelpersURL = OWLTransformations.class.getResource("resources/Ecore2OWLHelpers.asm");
	
	private static final URL owl2ecoreURL = OWLTransformations.class.getResource("resources/owl2ecore.asm");
	
	private static final URL owl2ecoreHelpersURL = OWLTransformations.class.getResource("resources/OWL2EcoreHelpers.asm");
	
	private static final URL owlHelpersURL = OWLTransformations.class.getResource("resources/OWLHelpers.asm");
	
	private static final URL ecoreRefineURL = OWLTransformations.class.getResource("resources/EcoreRefine.asm");;
	
	
	private static MultiInOneOutTransformation ecore2owl;
	
	private static OneInOneOutTransformation owl2ecore;

	private static OneInOneOutTransformation ecoreRefine;
	
	static {
		register(OWLPackage.eINSTANCE.eResource());
	}

	public static Transformation<Set<EMFModel>, EMFModel> ecore2owl() {
		if (ecore2owl == null) {
			ecore2owl =  new Transformations.Builder()
			.asm(ecore2owlURL)
			.lib("Ecore2OWLHelpers", ecore2owlHelpersURL)
			.lib("PropertiesHelpers", Properties.getHelpers())
			.in(ecore(), "IN", "ecore")
			.in(Properties.getReferenceModel(), "IN2", "Properties")
			.out(get(OWLPackage.eNS_URI), "OUT", "owl")
			.buildMultiInOneOut();
		} 
		return ecore2owl;
	}
	
	public static Transformation<Set<EMFModel>, EMFModel> ecore2owl(OWLFormats format) {
		final Map<String, Object> atloptions = new HashMap<String, Object>();
		atloptions.put("extensionObjects", getListExtension());
//		atloptions.put("allowInterModelReferences", true);
		
		return new Transformations.Builder()
		.asm(ecore2owlURL)
		.options(atloptions)
		.lib("Ecore2OWLHelpers", ecore2owlHelpersURL)
		.lib("PropertiesHelpers", Properties.getHelpers())
		.in(ecore(), "IN", "ecore")
		.in(Properties.getReferenceModel(), "IN2", "Properties")
		.out(get(OWLPackage.eNS_URI), "OUT", "owl", factory(format))
		.buildMultiInOneOut();
	}
	
	public static Transformation<EMFModel, EMFModel> owl2ecore() {
		if (owl2ecore == null) {
			owl2ecore = new Transformations.Builder()
			.asm(owl2ecoreURL)
			.lib("OWLHelpers", owlHelpersURL)
			.lib("OWL2EcoreHelpers", owl2ecoreHelpersURL)
			.in(get(OWLPackage.eNS_URI), "IN", "owl")
			.out(ecore(), "OUT", "ecore")
			.buildOneInOneOut();
		}
		return owl2ecore;
	}

	public static Transformation<EMFModel, EMFModel> ecoreRefine() {
		if (ecoreRefine == null) {
			ecoreRefine = new Transformations.Builder()
			.asm(ecoreRefineURL)
			.in(ecore(), "IN", "ecore")
			.out(ecore(), "OUT", "ecore")
			.buildOneInOneOut();
		}
		return ecoreRefine;
	}

	private static Resource.Factory factory(OWLFormats format) {
		return (Factory) Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(
				format.extension().substring(1));
	}
	
	private static List<LibExtension> getListExtension() {
		final List<LibExtension> list = new ArrayList<LibExtension>();
		list.add(new ATLExtensions());
		
		return list;
	}
}
