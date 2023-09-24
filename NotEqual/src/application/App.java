package application;

public class App {
	public static void main(String[] args) {

		// != "not equals" binary operator

		int value1 = 4;
		int value2 = 3;

		if (value1 != value2) {

			System.out.println("Values are not equal!");
		}
		
		System.out.println(value1 != value2);
		System.out.println(value1 == value2);
		
		String fruit1 = "orange";
		String fruit2 = "apple";
		
		if(fruit1.equals(fruit2)) {
			System.out.println("Fruits are the same!");
		}
		
		if(!fruit1.equals(fruit2)) {
			System.out.println("Fruits are NOT the same!");
		}

		if(fruit1.equals(fruit2) != true) {
			System.out.println("Fruits are NOT the same!");
		}
	}

}
