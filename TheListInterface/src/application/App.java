package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers1 = new ArrayList<>();
		
		numbers1.add(5);
		numbers1.add(77);
		numbers1.add(2);

		System.out.println(numbers1.get(1));
		
		// List Interface
		
		List<Integer> numbers2 = new LinkedList<>();
		
		numbers2.add(7);
		numbers2.add(87);
		numbers2.add(12);

		System.out.println(numbers2.get(1));
		
		displayList(numbers1);
		displayList(numbers2);
		
		
		
	}
	
	private static void displayList(List<Integer> list) {
		
		list.forEach(System.out::println);
	}

}
