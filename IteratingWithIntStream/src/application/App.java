package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animals = { "Cat", "Dog", "Sloth", "Elephant" };
		
		IntStream.range(0, animals.length).forEach(i -> {
			System.out.printf("%d. %s\n", (i + 1), animals[i]);
		});

//		for (int i = 0; i < animals.length; i++) {
//			System.out.printf("%d. %s\n", (i + 1), animals[i]);
//		}

	}

}
