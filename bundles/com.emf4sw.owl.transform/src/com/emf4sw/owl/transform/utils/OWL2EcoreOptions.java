package com.emf4sw.owl.transform.utils;

import java.util.Map;

public class OWL2EcoreOptions {

	public static final String OWL2ECORE_REFINE_METAMODEL = "OWL2ECORE_REFINE_METAMODEL";
	
	public static boolean needRefiningTransformation(Map<String, Object> options) {
		if (options != null && options.containsKey(OWL2EcoreOptions.OWL2ECORE_REFINE_METAMODEL)) {
			Object value = options.get(OWL2EcoreOptions.OWL2ECORE_REFINE_METAMODEL);
			if (value instanceof Boolean) {
				return (Boolean) value;
			} else if (value instanceof String) {
				return Boolean.getBoolean((String) value);
			}
		}
		return false;
	}
}
