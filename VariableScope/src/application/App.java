package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int value = 0;
			System.out.println(value);
		}
		
		//Error - out of scope
		//System.out.println(value);
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
		
		//System.out.println(i);
		
		String input = null; //easier to debug instead of "" 
		do {
			System.out.println("Type 'quit' to quit the program.");
			input = scanner.nextLine();
			
		}while(!input.equals("quit"));
		
		scanner.close();
		
	}

}
