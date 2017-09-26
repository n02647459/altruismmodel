package altruismmodel.core;

import java.util.Vector;

public class Environment {
	// This needs to be changed to some kind of data structure where I can quickly search
 	// through for organisms with signatures which are x% or more the same.
	Vector<Organism> population;
	
	public Environment() {
		population = new Vector<Organism>();
	}
	// Generates a new population with two distinct signatures and a range from 0 - 1 for both
	// altruism and inout affinity, with an average of 0.5 for each
	public void generate_basic() {
		// Create the signature of subpopulation 1
		Random rg = new Random();
		int int1 = rg.nextInt(2097152); // Create a random number between 0 and 2097151
		String sig1 = Integer.toBinaryString(int1);
		// Create the signature of subpopulation 2
		int int2 = rg.nextInt(2097152);
		String sig2 = Integer.toBinaryString(int2);
		
		// Randomly generate a population with parameters between (0, 0) and (1,1) w/ 
		// average of (0.5, 0.5) with uniform distribution
		
		for (int i = 0; i < 100; i++) {
			rg.nextDouble();
		}
	}
}
