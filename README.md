# Eclipse Modeling For Semantic Web

EMF4SW is a set of Eclipse plugins that brings Semantic Web (SW) languages such as OWL, RDF and SPARQL to the Eclipse Modeling Framework Eclipse Modeling Framework (EMF).

## Load RDF from Turtle file

	RDFGraph aGraph = new TTLResourceImpl().createGraph();
	aGraph.addTriple(
        	aGraph.getResource("http://ex.org/a"), 
	        aGraph.getProperty("http://ex.org/b"),
	        aGraph.getResource("http://ex.org/c"));

googlecode project: http://code.google.com/a/eclipselabs.org/p/emftriple/

