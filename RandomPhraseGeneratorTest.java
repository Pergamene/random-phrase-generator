package comprehensive;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class to see if all the possible phrases
 * are generated from a small finite grammar file.
 * 
 * @author Austin Glenn (aglenn), Jason Brinton (jasonb) 
 * Last updated: 12/7/15
 */
public class RandomPhraseGeneratorTest {

	RandomPhraseGenerator rpg;
	HashMap<String, Integer> map;
	
	@Before
	// Create a map of all the possible phrases and a count variable.
	public void setUp() throws Exception {
		rpg = new RandomPhraseGenerator();
		map = new HashMap<String, Integer>();
		
		map.put("The cat sat on the cat.", 0);
		map.put("The cat stood on the cat.", 0);
		map.put("The cat sat on the dog.", 0);
		map.put("The cat stood on the dog.", 0);
		map.put("The cat sat on the mouse.", 0);
		map.put("The cat stood on the mouse.", 0);
		
		map.put("The dog sat on the cat.", 0);
		map.put("The dog stood on the cat.", 0);
		map.put("The dog sat on the dog.", 0);
		map.put("The dog stood on the dog.", 0);
		map.put("The dog sat on the mouse.", 0);
		map.put("The dog stood on the mouse.", 0);
		
		map.put("The mouse sat on the cat.", 0);
		map.put("The mouse stood on the cat.", 0);
		map.put("The mouse sat on the dog.", 0);
		map.put("The mouse stood on the dog.", 0);
		map.put("The mouse sat on the mouse.", 0);
		map.put("The mouse stood on the mouse.", 0);
	}

	@Test
	// Count how many times each phrase is generated and make sure that
	// each phrase has been generated at least once.
	public void testRPG() {
		ArrayList<String> phrases = rpg.generatePhrasesArray("super_simple.g", 1000);
		ArrayList<Integer> values = new ArrayList<Integer>();

		for(String s: phrases)
			map.put(s, map.get(s) + 1);
		values.addAll(map.values());
		for(Integer i: values)
			assertTrue(i > 0);
	}
	
	@Test
	// Test to see if all the phrases generated are expected phrases.
	public void testRPGCount() {
		ArrayList<String> phrases = rpg.generatePhrasesArray("super_simple.g", 1000);
		ArrayList<Integer> values = new ArrayList<Integer>();
		int count = 0;
		
		for(String s: phrases)
			map.put(s, map.get(s) + 1);
		values.addAll(map.values());
		for(Integer i: values)
			count += i;
		assertEquals(1000, count);
	}

}
