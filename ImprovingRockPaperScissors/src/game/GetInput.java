package game;

import java.util.Scanner;

public class GetInput {
	
	private Scanner scanner = new Scanner(System.in);	

	public int newInput() {
		// TODO Auto-generated method stub
		scanner.reset();
		
		String input;
		String message = "Enter your choice (0. rock, 1. paper, 2. scissors): ";
		String messageWrong = "Wrong Choice!";
		int number = 0;
		boolean loop = true;
		

		do {

			System.out.print(message);
			while ((input = scanner.nextLine()).isEmpty()) {
				//System.out.println("That's not a char!");
				System.out.print(message);
				//scanner.next(); // this is important!
			}

			if (input.length() != 1) {
				System.out.println(messageWrong);
			} else {
				if (input.matches("[0-2]{1}")) {
				    //valid input
					//System.out.printf("GetInput: input taken: %s\n", input);
					loop = false;
				}else {
					System.out.println(messageWrong);
				}
					
			} 	

			

		}while(loop);	
		
	    try{
	    	number = Integer.parseInt(input);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
	    
	    return number;

	}
	
	public void close() {
		scanner.close();
	}
}
