package application;

import java.util.Scanner;

public class GetChar {
	
	private Scanner scanner = new Scanner(System.in);	

	public char newChar() {
		// TODO Auto-generated method stub
		scanner.reset();
		
		String guess;
		boolean loop = true;
		

		do {

			System.out.print("Please enter a char > ");
			while ((guess = scanner.nextLine()).isEmpty()) {
				System.out.println("That's not a char!");
				System.out.print("Please enter char > ");
				//scanner.next(); // this is important!
			}

			if (guess.length() != 1) {
				System.out.println("Please enter ONE char!");
			} else {
				if (guess.matches("[A-Za-z]{1}")) {
				    //valid input
					System.out.printf("GetChar: char taken: %s\n", guess);
					loop = false;
				}else {
					System.out.println("Please enter a char (A - Z)!");
				}
					
			} 	

			

		}while(loop);		

		return guess.charAt(0);
	}
	
	public void close() {
		scanner.close();
	}
}
