package application;

import java.util.Scanner;

public class GetIntegers {

	int[] newIntegers(int amount) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] integerArray = new int[amount];

		for (int i = 0, num = 1; i < amount; i++, num++) {

			System.out.print("Please enter number " + num + " > ");
			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!");
				System.out.print("Please enter number " + num + " > ");
				scanner.next(); // this is important!
			}

			integerArray[i] = scanner.nextInt();

		}
		scanner.close();

		return integerArray;
	}
}
