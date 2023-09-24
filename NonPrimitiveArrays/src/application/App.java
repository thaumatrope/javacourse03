package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text;
		
		text = new String("Hello!"); // String-Constructor
		
		text = "Hello!"; // same, like a shortcut
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3]; // creates three variables that refer to Strings.
		System.out.println(texts); // reference to String Array
		
		texts[0] = new String("Hi!");
		texts[1] = "How are you?";
		texts[2] = "Nice Weather!";
		
		for(String word:texts) {
			System.out.println(word);
		}
		
		System.out.println(texts); // reference to String Array

	}

}
