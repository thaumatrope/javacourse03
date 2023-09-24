/**
 * 
 */
package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		boolean gotCodweword = false;
		
		for(;;) {  //infinite for-loop
			System.out.println(" > ");
			String input = scanner.nextLine();
			
			if(input.equals("quit")) {
				break;
			} else if(input.equals("volcano")) {
				gotCodweword = true;
			}
		}
		
		scanner.close();
		
		if(gotCodweword) {
			System.out.println("Codeword entered.");
			
		}else {
			System.out.println("No Codeword detected.");
		}
	}

}
