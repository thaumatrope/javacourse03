package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int option = 10;
		 * 
		 * switch(option) {
		 * 
		 * case 0: System.out.println("Option 0 selected."); break; case 1:
		 * System.out.println("Option 1 selected."); break; case 10:
		 * System.out.println("Exiting program ..."); System.exit(0); break; default:
		 * System.out.println("Invalid option"); break; }
		 */

		System.out.println("Menu");
		System.out.println("====");
		System.out.println();
		System.out.println("1. Print 'hello'");
		System.out.println("2. Print 'How are you?'");
		System.out.println("3. Exit program");
		System.out.println();
		System.out.print("Enter an option > ");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();

		if (input > 100) {
			System.out.println("You've found the hidden Easter egg!");
		} else {

			switch (input) {

			case 1:
				System.out.println("Hello");
				break;
			case 2:
				System.out.println("How are you?");
				break;
			case 3:
				System.out.println("Exiting ...");
				System.exit(0);
			case 100:

				break;
			default:
				System.out.println("Invalid option.");
				break;
			}
		}

	}

}
