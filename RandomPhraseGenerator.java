package comprehensive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * A class which generates n sentences from a given grammar file.
 * 
 * @author Austin Glenn (aglenn), Jason Brinton (jasonb) 
 * Last updated: 12/7/15
 */
public class RandomPhraseGenerator {

	public static void main(String[] args) {
		RandomPhraseGenerator generator = new RandomPhraseGenerator();
		generator.generatePhrases(args[0], Integer.parseInt(args[1]));
	}

	private HashMap<String, ArrayList<String>> terminals;
	private StringBuilder phrase;
	private Random rng;
	private boolean readFile;
	
	/**
	 * Creates a new random phrase generator.
	 */
	public RandomPhraseGenerator() {
		terminals = new HashMap<String, ArrayList<String>>();
		phrase = new StringBuilder();
		rng = new Random();
		readFile = false;
	}

	/**
	 * Reads the given grammar file.  Must be completed before
	 * phrases can be generated.
	 * 
	 * @param fileName
	 * 				-- the path to the grammar file
	 */
	public void readFile(String fileName) {
		try {
			boolean inTerminal = false;
			boolean readTerminalName = false;
			String	terminalName = "";
			Scanner fileIn = new Scanner(new File(fileName));
			
			while(fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				if(line.equals("{"))
					inTerminal = true;
				else if(line.equals("}")) {
					inTerminal = false;
					readTerminalName = false;
				}
				else if(!inTerminal)
					continue;
				else if(line.charAt(0) == '<' && !readTerminalName) {
					terminalName = line.substring(1, line.length() - 1);
					terminals.put(terminalName, new ArrayList<String>());
					readTerminalName = true;
				}
				else if(inTerminal && readTerminalName)
					terminals.get(terminalName).add(line);
			}
			readFile = true;
			fileIn.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("No file found.");
		}
	}
	
	/**
	 * Reads the given grammar file and generates the given number of phrases.
	 * Phrases are printed to the console.
	 * 
	 * @param fileName
	 * 				-- the path to the grammar file
	 * @param number
	 * 				-- the number of phrases to be generated
	 */
	public void generatePhrases(String fileName, int number) {
		readFile(fileName);
		generatePhrases(number);
	}
	
	/**
	 * Generates the given number of phrases.  Phrases are printed to the console.
	 * 
	 * @param number
	 * 				-- the number of phrases to be generated
	 */
	public void generatePhrases(int number) {
		if(!readFile)
			System.out.println("You must read a file first.");
		StringBuilder allPhrases = new StringBuilder();
		int count = 0;
		for(int i = 0; i < number; i++) {
			phrase.append(readTerminal("start"));
			int openIndex = phrase.indexOf("<");
			int closeIndex = phrase.indexOf(">");
			String terminal;
			while(openIndex >= 0) {
				terminal = phrase.substring(openIndex + 1, closeIndex);
				phrase.replace(openIndex, closeIndex + 1, readTerminal(terminal));
				openIndex = phrase.indexOf("<", openIndex);
				closeIndex = phrase.indexOf(">", openIndex);
			}
			allPhrases.append(phrase + "\n");
			phrase.delete(0, phrase.length());
			if(count++ >= 1000) {
				System.out.print(allPhrases);
				allPhrases.delete(0, allPhrases.length());
				count = 0;
			}
		}
		System.out.print(allPhrases);
	}
	
	/**
	 * Generates the given number of phrases.  Phrases are stored in an array list.
	 * 
	 * @param fileName
	 * 				-- the path to the grammar file
	 * @param number
	 * 				-- the number of phrases to be generated
	 * @return an array list of the generated phrases
	 */
	public ArrayList<String> generatePhrasesArray(String fileName, int number) {
		ArrayList<String> phrases = new ArrayList<String>();
		readFile(fileName);
		for(int i = 0; i < number; i++) {
			phrase.append(readTerminal("start"));
			int openIndex = phrase.indexOf("<");
			int closeIndex = phrase.indexOf(">");
			String terminal;
			while(openIndex >= 0) {
				terminal = phrase.substring(openIndex + 1, closeIndex);
				phrase.replace(openIndex, closeIndex + 1, readTerminal(terminal));
				openIndex = phrase.indexOf("<", openIndex);
				closeIndex = phrase.indexOf(">", openIndex);
			}
			phrases.add(phrase.toString());
			phrase.delete(0, phrase.length());
		}
		return phrases;
	}
	
	/**
	 * Takes a name of a non-terminal and returns a random terminal from
	 * the non-terminal.
	 * 
	 * @param nonterminal
	 * 				-- the name of the nonterminal to get a terminal from
	 * @return a random terminal from the given nonterminal
	 */
	private String readTerminal(String nonterminal) {
		ArrayList<String> terminal = terminals.get(nonterminal);
		return terminal.get(rng.nextInt(terminal.size()));
	}
}