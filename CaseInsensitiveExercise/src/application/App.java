package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		final String START = "start";
		final String STOP = "stop";
		final String QUIT = "quit";
		String command = null;
		boolean loop = true;

		for (;loop;) {
			System.out.print("Please enter a command > ");
			command = scanner.nextLine();

			if (command.length() == 0) {
				continue;
			}
			else if (command.equalsIgnoreCase(START)) {
				System.out.println("Machine starting .... ");
				
			}
			else if (command.equalsIgnoreCase(STOP)) {
				System.out.println("Machine stopping .... ");
				
			}
			else if (command.equals(QUIT)) {
				System.out.println("Exiting .... ");
				loop = false;
			}
			else {
				System.out.println("Unrecognized command. ");
			}
			
			/*
			command.toUpperCase();
			 
			switch(command){
			case "START":
				System.out.println("Machine starting .... ");
				continue;
			case "STOP":
				System.out.println("Machine stopping .... ");
				continue;
			case "QUIT":
				System.out.println("Exiting .... ");
				continue;
			default:
				System.out.println("Unrecognized command. ");
			}
			*/

		}

		scanner.close();

	}

}
