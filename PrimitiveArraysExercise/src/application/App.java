package application;

import java.util.Scanner;
import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		final int NUM_VALUES = 3;
		boolean loop = true;
		int saveNumber = 1;
		int[] userNumbers = new int[NUM_VALUES];
		int totalNumber = 0;
		
		
		do {
			System.out.print("Please enter number " + saveNumber + " > ");
			while (!scanner.hasNextInt()) {
		        System.out.println("That's not a number!");
		        System.out.print("Please enter number " + saveNumber + " > ");
		        scanner.next(); // this is important!		        
		    }
			
			userNumbers[saveNumber-1] = scanner.nextInt();	
			saveNumber++;
			if(saveNumber > NUM_VALUES) {
				loop = false;
			}
			
				
			
		}while(loop);
		
		
		
		scanner.close();
		
		for(int num:userNumbers) {
			System.out.println("Your numbers are: " + num);
		}
		
//		System.out.println("Your numbers are:");
//		IntStream.range(0, NUM_VALUES).forEach(i -> {
//			System.out.printf("%d\n", userNumbers[i]);
//			
//		});
		for (int i = 0; i < NUM_VALUES; i++) {
			totalNumber += userNumbers[i];
		}
		System.out.printf("Total number is: %d\n", totalNumber);
	}

}
