package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fahrenheit = 91;
		double celsius = (fahrenheit -32) * (5.0 /9.0);
		
		System.out.println(fahrenheit + " °F is " + celsius + " °C.");
		
		System.out.print("Hello");
		System.out.print("Hello");
		
		
		double value = 234.362372812936;
		//Formatting Specifiers
		System.out.println("\n");
		System.out.printf("Hello %.10f \n", value);  // %f Floating point
		System.out.printf("Hello %s %d\n", "John", 123);	// %d decimal  // %s String

	}

}
