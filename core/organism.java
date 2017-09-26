package altruismsmodel.core;

public class Organism {
	String signature;
	// From 0 - 1, the level of overall altruism
	double altruism; 
	/* From 0 - 1, the level of ingroup vs outgroup altruism
	** A value of zero means that only an exact signature match will be tolerated, while
	** a value of one means that the organism will be altruistic towards all individuals,
	** regardless of signature
	*/
	double inout; 

	public Organism() {
		Organism(0.5, 0.5);
	}
	public Organism(double a, double b) {
		altruism = a;
		inout = b;
	}
}
