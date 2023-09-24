package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "orange";
		String text2 = "apples";
		String text3 = "orange";
		
		System.out.println(text1 == text3); //compares the string address -> true because Java uses literals only once, both variables point to the same literal 
		System.out.println("Strings are identical: " + text1.equals(text3)); //compares the string content
	}

}
