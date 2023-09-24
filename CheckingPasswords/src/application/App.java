package application;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		final String USER_PASSWORD = "hello";		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter password > ");			
			
			String password = scanner.nextLine();			
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("Access granted.");		
				break;
			}
			else
			{
				System.out.println("Access denied."); 
			
			}			
			
		}
		
		scanner.close();
	}

}
