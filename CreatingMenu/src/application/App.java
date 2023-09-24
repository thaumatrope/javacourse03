package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		/*
		 * 		Select an Option:
		 * 			1. Add an entry
		 * 			2. View the database
		 * 			3. Exit
		 * 
		 */
		
		
		
		String prompt = "Select an option:";
		String option1 = "Add an entry";
		String option2 = "View the database";
		String option3 = "Exit";
		
		int value1 = 1;
		int value2 = 2;
		int value3 = 3;
		
		String menu = "\t" + prompt;
		menu += "\n\t\t" + value1 + ". " + option1;
		menu += "\n\t\t" + value2 + ". " + option2;
		menu += "\n\t\t" + value3 + ". " + option3;
		
		System.out.println(menu);
		
	}

}
