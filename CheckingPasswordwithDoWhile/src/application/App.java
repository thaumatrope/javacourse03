package application;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final String USER_PASSWORD = "secret";		
		Scanner scanner = new Scanner(System.in); 
		
		String password;
		Boolean pass = false;
		
		do {
			System.out.println("Enter password > ");			
			
			password = scanner.nextLine();
		
			//System.out.println("Access denied."); 	
			
			
		}while(!password.equals(USER_PASSWORD));
		
		scanner.close();
		System.out.println("Access granted.");	
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
