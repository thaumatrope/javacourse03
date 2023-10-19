package application;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> people = new HashMap<>();
		people.put(0,  "Mary"); 
		people.put(1,  "Mary");
		people.put(3,  "Joe");
		people.put(3,  "Zoltan"); // keys are unique, overwrites previous entries with the same key.
		people.put(10,  "Sue");
		people.put(4,  "Fred");
		
		System.out.println(people.get(4));
		System.out.println();
		
		System.out.println(people.containsKey(12));
		System.out.println();
		
		people.forEach((k,v)->{
			System.out.println(k + " : " + v);
		});
		
		

	}

}
