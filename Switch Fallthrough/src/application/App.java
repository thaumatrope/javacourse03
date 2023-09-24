package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Do you want to proceed (y/n): ");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		scanner.close();
		
		switch(input) {
		
		case "y":
			System.out.println("Proceeding ... ");
			break;
		case "n":
			System.out.println("Not proceeding.");
			break;
		default:
			System.out.println("Unrecognized option.");
			break;
		}
		
		

	}

}
