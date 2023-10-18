package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1984 = new File(".\\1984.txt");
		File fileAnimal = new File(".\\Animal Farm.txt");
		
		
//		try {
//			System.out.println(file1984.getCanonicalPath());
//			System.out.println(fileAnimal.getCanonicalPath());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		String test = "It was a ,,bright cold ,day in April, and the clocks,,were striking thirteen. Winston";
//		System.out.println(test);
//		String[] result = test.split("[,.\\s]+");
//		
//		for(var word:result) {
//			System.out.print(word + " ");
//		}	
//		
//		System.exit(0);
		
		TreeSet<String> words1984 = new TreeSet<String>();
		TreeSet<String> wordsAnimal = new TreeSet<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file1984))){
			String newline;
			String[] newwords;
			while ((newline = br.readLine()) != null) {
				
//				newwords = newline.split("[.,\\—\\s]+");
				newwords = newline.split("[0-9]*\\W");				
				
				for(var word:newwords) {
					words1984.add(word.trim());
				}	
			}
			
		}catch(FileNotFoundException e) {			
			System.out.println("File not found: " + file1984);
			
		}catch(IOException e) {
			System.out.println("Can't read file: " + file1984);
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileAnimal))){
			String newline;
			String[] newwords;
			while ((newline = br.readLine()) != null) {
				newwords = newline.split("[0-9]*\\W");
				
				for(var word:newwords) {
					wordsAnimal.add(word.trim());
				}			
			}
			
		}catch(FileNotFoundException e) {			
			System.out.println("File not found: " + fileAnimal);
			
		}catch(IOException e) {
			System.out.println("Can't read file: " + fileAnimal);
		}
			
		System.out.println();
		System.out.println("Starting subset1984....");
		System.out.println();
		
		TreeSet<String> subset1984 = new TreeSet<String>(words1984); // subset (Teilmenge)
		subset1984.removeAll(wordsAnimal);
		
		int i = 20;
		for (var word: subset1984) {
			if(i < 0) {
				System.out.println();
				i = 20;
			}
			System.out.print(word + " ");
			i--;
		}
		System.out.println();
		
		
		System.out.println();
		System.out.println("Starting subsetAnimal....");		
		System.out.println();
		
		TreeSet<String> subsetAnimal = new TreeSet<String>(wordsAnimal); // subset (Teilmenge)
		subsetAnimal.removeAll(words1984);
		
		i = 20;
		for (var word: subsetAnimal) {
			if(i < 0) {
				System.out.println();
				i = 20;
			}
			System.out.print(word + " ");
			i--;
		}
		System.out.println();
		
		
		System.out.println();
		System.out.println("Starting union....");
		
		System.out.println();
		
		
		TreeSet<String> union = new TreeSet<String>(words1984);
		union.addAll(wordsAnimal); // union (gemeinsame Menge)
		
		i = 20;
		for (var word: union) {
			if(i < 0) {
				System.out.println();
				i = 20;
			}
			System.out.print(word + " ");
			i--;
		}
		
		System.out.println();
		System.out.println("Starting intersection....");
		
		System.out.println();
		
		
		TreeSet<String> intersection = new TreeSet<String>(words1984);
		intersection.retainAll(wordsAnimal); // intersection (Schnittmenge)
		
		i = 20;
		for (var word: intersection) {
			if(i < 0) {
				System.out.println();
				i = 20;
			}
			System.out.print(word + " ");
			i--;
		}
		
		

		
		
	}

}
