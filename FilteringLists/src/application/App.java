package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var numbers = new ArrayList<>(List.of(3,5,7,2,9,10,4));
		
		numbers.add(18);
		numbers.forEach(System.out::println);
		
		// Filtering
		numbers.removeIf(s -> s >= 5);
		
		System.out.println(numbers.getClass());
		numbers.forEach(System.out::println);
		
		var texts = new ArrayList<>(List.of("Joygurt","Sex","Pussy","Boobs","Appletree","Gyroskope","Brownie"));
		texts.forEach(System.out::println);
		texts.removeIf(t -> t.length() <= 5);
		
		System.out.println(texts.getClass());
		texts.forEach(System.out::println);
		
	}

}
