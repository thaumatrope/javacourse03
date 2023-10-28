package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var numbers = new ArrayList<Integer>(List.of(3,5,7,18,5,3,11));
		numbers.forEach(System.out::println);
		numbers.replaceAll(n -> n*n);
		System.out.println();
		numbers.forEach(System.out::println);
		System.out.println();
		
		var texts = new ArrayList<String>(List.of("Bob","Nadja","Regine","Rita","Katharina", "Tamara"));
		texts.forEach(System.out::println);
		System.out.println();
		texts.replaceAll(s -> "Hello " + s);
		texts.forEach(System.out::println);
	}

}
