package application;

import java.nio.channels.AcceptPendingException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String PASSPHRASE = "Secure";
		Scanner scanner = new Scanner(System.in);

		String password = null;
		
		boolean accessGranted = false;


		// do {

		for (int attempts = 0; attempts < 3; attempts++) {
			
			System.out.println("Enter password > ");

			password = scanner.nextLine();

			if (!password.equals(PASSPHRASE)) {
				System.out.println("Incorrect password.");
			
			} else {
				accessGranted = true;
				break;
			}
		}
		
		if(accessGranted) {
			System.out.println("Access granted.");
		}else {
			System.out.println("Access denied.");
		}

				
		scanner.close();
	}

}
