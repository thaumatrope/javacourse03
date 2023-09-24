package application;

import java.util.Scanner;

public class GetIntegers {
	
	Scanner scanner = new Scanner(System.in);	

	int[] newIntegers(int amount) {
		// TODO Auto-generated method stub
		scanner.reset();
		
		int[] integerArray = new int[amount];

		for (int i = 0, num = 1; i < amount; i++, num++) {

			System.out.print("Please enter number " + num + " > ");
			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!");
				System.out.print("Please enter number " + num + " > ");
				scanner.next(); // this is important!
			}

			integerArray[i] = scanner.nextInt();
			System.out.printf("GetIntegers: int taken: %d\n", integerArray[i]);

		}
		
		

		return integerArray;
	}
	
	void scannerClose() {
		scanner.close();
	}
}
