package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {
	
	public static SortedSet<String> loadWords(File file){
		
		TreeSet<String> wordSet = new TreeSet<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String newline;
			
			while ((newline = br.readLine()) != null) {
				
				String[] newwords = newline.split("[^a-zA-Z]+");				
				
				for(var word:newwords) {
					wordSet.add(word.trim().toLowerCase());
				}	
			}
			
		}catch(FileNotFoundException e) {			
			System.out.println("File not found: " + file);
			
		}catch(IOException e) {
			System.out.println("Can't read file: " + file);
		}
		
		return wordSet;
		
	}
	
	private static void displayWords(SortedSet<String> wordSet) {
		
		
		
		int i = 0;
		for (var word: wordSet) {			
			System.out.printf("%-15s ", word);
			if(++i % 40 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1984 = new File(".\\1984.txt");
		File fileAnimal = new File(".\\Animal Farm.txt");		

		
		var words1984 = loadWords(file1984);
		var wordsAnimal = loadWords(fileAnimal);
		
		System.out.println();
		System.out.println("Starting words1984....with " + words1984.size() + " unique words.");
		System.out.println();
		
		TreeSet<String> subset1984 = new TreeSet<String>(words1984); // subset (Teilmenge)
		subset1984.removeAll(wordsAnimal);
		System.out.println("Unique words only in words1984...." + subset1984.size());
		
//		displayWords(subset1984);
		
		
		System.out.println();
		System.out.println("Starting wordsAnimal....with " + wordsAnimal.size() + " unique words.");		
		System.out.println();
		
		TreeSet<String> subsetAnimal = new TreeSet<String>(wordsAnimal); // subset (Teilmenge)
		subsetAnimal.removeAll(words1984);
		System.out.println("Unique words only in wordsAnimal...." + subsetAnimal.size());
		
//		displayWords(subsetAnimal);
			

		System.out.println();
		System.out.println("Starting intersection....");
		
		System.out.println();
		
		
		TreeSet<String> intersection = new TreeSet<String>(words1984);
		intersection.retainAll(wordsAnimal); // intersection (Schnittmenge)
		System.out.println("Unique words appearing in both wordsAnimal & words1984 ...." + intersection.size());
		
//		displayWords(intersection);
		
		
		System.out.println();
		System.out.println("Starting union....");
		
		System.out.println();
		
		
		TreeSet<String> union = new TreeSet<String>(words1984);
		union.addAll(wordsAnimal); // union (gemeinsame Menge)
		System.out.println("All unique words of both wordsAnimal & words1984 ...." + union.size());
		
//		displayWords(union);
		
		
		
	}

}
