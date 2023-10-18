package application;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {

				LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("Apple");  // returns true
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Orange");
		fruits.add("Kiwi");  // no duplicates - method returns false
		
		for(var fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println();
		System.out.println(fruits.contains("cherry"));
		
		

	}

}
