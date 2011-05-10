/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package com.emf4sw.rdf.transform.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.atl.engine.emfvm.lib.AbstractStackFrame;
import org.eclipse.m2m.atl.engine.emfvm.lib.ExecEnv;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;
import org.eclipse.m2m.atl.engine.emfvm.lib.Operation;

import com.emf4sw.rdf.operations.DatatypeConverter;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5	
 */
public class ETripleLibExtension implements LibExtension {

	@Override
	public void apply(ExecEnv execEnv, Map<String, Object> options) {
		Operation convertToOperation = new Operation(2, "convertTo") {  
			@Override
			public Object exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();

				if (localVars[1] instanceof String) {
					String var1 = (String) localVars[1];

					if (localVars[0] instanceof String) {
						String var2 = (String) localVars[0];
						Object ret = DatatypeConverter.convert(var1, var2);
						if (ret == null) {
							return DatatypeConverter.convert(var1, "");
						}
						return ret;
					}
				}
				return null;
			}
		};
		execEnv.registerOperation(Object.class, convertToOperation);

		Operation asStringOperation = new Operation(2, "asString") {  
			@Override
			public Object exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();
				Object object = localVars[0]; 
				if (localVars[1] instanceof String) {
					return DatatypeConverter.toString((String) localVars[1], object);
				}				
				return localVars[1].toString();
			}
		};
		execEnv.registerOperation(Object.class, asStringOperation);

		Operation getEcoreIdOperation = new Operation(1, "getEcoreId") {  
			@Override
			public String exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();
				if (localVars[0] instanceof EObject) {
//					URI generatedId = null;//EcoreUtil.getURI((EObject) localVars[0]);
//					if (generatedId == null) {
//						String ns = ((EObject) localVars[0]).eClass().getEPackage().getNsURI();
//						ns = ns.endsWith("/") ? ns : ns+"/";
						
						return EcoreUtil.generateUUID();
//					}
//					String cut = generatedId.toString().substring(generatedId.toString().indexOf("#"), generatedId.toString().length() - 1);
//					if (cut.startsWith("#//"))
//						cut = cut.substring(3);
//					return cut;			
				}
				throw new IllegalArgumentException("Cannot get URI from " + localVars[0]);
			}
		};
		execEnv.registerOperation(Object.class, getEcoreIdOperation);

		Operation split_annotation = new Operation(1, "split_annotation") {  
			@Override
			public List<String> exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();
				if (localVars[0] instanceof String) { 
					return split_annotation((String) localVars[0]);			
				}
				throw new IllegalArgumentException("Cannot get URI from " + localVars[0]);
			}

			private List<String> split_annotation(String object) {
				List<String> list = new ArrayList<String>();
				boolean in = false;
				String tmp = "";
				for (int i=0; i < object.length(); i++)
				{
					char c = object.charAt(i);
					if (c == ','&& !in) {
						list.add(tmp);
						tmp = "";
					} else
						if (c == '(') {
							tmp = tmp + c;
							in = true;
						} else
							if (c == ')') {
								tmp = tmp + c;
								in = false;
							} else {
								tmp = tmp + c;
							}
				}
				list.add(tmp);
				return list;
			}
		};
		execEnv.registerOperation(Object.class, split_annotation);

	}


}
