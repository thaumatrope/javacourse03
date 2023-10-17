package application;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> fruits = new HashSet<>();
		
		
		fruits.add("Apple");  // returns true
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Orange");
		fruits.add("Kiwi");  // no duplicates - method returns false
		
		System.out.println(fruits.contains("Cherry"));
		System.out.println(fruits.contains("Banana"));
		
		for(var fruit:fruits) {
			System.out.println(fruit);
		}
	}

}
