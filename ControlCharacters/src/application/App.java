package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non-printing characters
		
		String text = "To be or not to be. That is the question.";
		System.out.println(text);
		
		text = "To be or not to be.\nThat is the question.";
		System.out.println(text);

		text = "\tTo be or not to be.\nThat is the question.";
		System.out.println(text);
		
		text = "\tTo be or not to be.\n\tThat is the question.";
		System.out.println(text);
		
		text = "\tTo be \\or not to be.\n\tThat is the question.";
		System.out.println(text);
		
		/*
		 * 		Select an Option:
		 * 			1. Add an entry
		 * 			2. View the database
		 * 			3. Exit
		 * 
		 */
		
		text = "\n\tSelect an Option:";
		System.out.println(text);
		text = "\t\t1. Add an entry";
		System.out.println(text);
		text = "\t\t2. View the database";
		System.out.println(text);
		text = "\t\t3. Exit";
		System.out.println(text);
		
	}

}
