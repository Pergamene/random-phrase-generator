package comprehensive;

import java.util.ArrayList;

/**
 * A class to time how long it takes to generate n random phrases.
 * 
 * @author Austin Glenn (aglenn), Jason Brinton (jasonb) 
 * Last updated: 12/7/15
 */
public class RandomPhraseGeneratorTimer {

	public static void main(String[] args) {
		
		ArrayList<Double> times = new ArrayList<Double>();
		ArrayList<Integer> size = new ArrayList<Integer>();

		// Do 1000 lookups and use the average running time.
		int timesToLoop = 1000;

		// For each problem size n . . .
		for (int n = 100000; n <= 1000000; n += 100000) {

			// Generate a new RandomPhraseGenerator, and read the grammar.
			RandomPhraseGenerator rpg = new RandomPhraseGenerator();
			rpg.readFile("assignment_extension_request.g");
			
			long startTime, midpointTime, stopTime;

			// First, spin computing stuff until one second has gone by.
			// This allows this thread to stabilize.
			startTime = System.nanoTime();
			while (System.nanoTime() - startTime < 1000000000) { // empty block
			}

			// Now, run the test.
			startTime = System.nanoTime();

			for (int i = 0; i < timesToLoop; i++) {
				rpg.generatePhrases(n);
			}

			midpointTime = System.nanoTime();

			// Run a loop to capture the cost of running the "timesToLoop" loop
			for (long i = 0; i < timesToLoop; i++) {
			}

			stopTime = System.nanoTime();

			// Compute the time, subtract the cost of running the loop
			// from the cost of running the loop and doing the lookups.
			// Average it over the number of runs.
			double averageTime = ((midpointTime - startTime) - (stopTime - midpointTime))
					/ timesToLoop;

			size.add(n);
			times.add(averageTime);			
		}
		
		// Print the timing data at the end of the print.
		System.out.println("\n\n\n\n\n\n");
		for(int i = 0; i < size.size(); i++) {
			System.out.println(size.get(i) + "\t" + times.get(i));
		}
	}
}
