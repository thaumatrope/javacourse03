package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(2));
		
	}
	
	// classical recursion examples
	// euler number e
	// Leibniz formula of pi
	// tower of hanoi
	
	public static int factorial(int value) {
		
	
		return value <= 1 ? 1 * value : value * factorial(value-1);		
	}

}
