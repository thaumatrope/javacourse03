package application;

import java.util.Scanner;

public class App {

	static int value;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number > ");
		String line = scanner.nextLine();
		
		try {
			value = Integer.parseInt(line);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number!");
		}
		
		
		System.out.println("You entered the number: " + value);
		
		scanner.close();
	}

}
