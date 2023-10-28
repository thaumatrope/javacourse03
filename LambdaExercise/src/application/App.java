package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var numbers = new ArrayList<Integer>(List.of(1, 5, 9, 1000, 3, 6, -10, 4));
		
		numbers.removeIf(n -> n < 0 || n > 10);
		numbers.forEach(System.out::println);
		System.out.println();
		numbers.replaceAll(n -> n + 100);
		numbers.forEach(System.out::println);
	}

}
