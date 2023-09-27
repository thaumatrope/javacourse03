package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		
//		int value = scanner.nextInt();
//		
//		System.out.println("Value: " + value);
//		
//		scanner.close();
//	}

		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter an interger > ");
			int value = scanner.nextInt();
			System.out.println("Value: " + value);
			
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid input!");
		}
	}
}
