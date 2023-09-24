package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fahrenheit = 91;
		double celsius = (fahrenheit -32) * (5.0 /9.0);
		
		System.out.println(fahrenheit + " °F is " + celsius + " °C.");
		System.out.printf("%.1f °F is %.1f °C.", fahrenheit, celsius);
		

	}

}
