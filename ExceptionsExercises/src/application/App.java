package application;

import java.util.Scanner;

public class App {

	static int value;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("et voila! the number is : " + App.getNumber());
		
	}

	private static int getNumber() {
		
		
		boolean loop = true;	
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.print("Please enter a number > ");
			String line = scanner.nextLine();
			try {
				value = Integer.parseInt(line);
				System.out.println("You entered the number: " + value);
				loop = false;
				
			} catch (NumberFormatException e) {
				System.out.println("Invalid number!");
			}
		}while(loop);
		
		scanner.close();
		
		return value;
		
		
	}
}
