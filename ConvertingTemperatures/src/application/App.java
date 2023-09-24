package application;
import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    DecimalFormat df = new DecimalFormat();
	    df.setMinimumFractionDigits(2);
	    df.setMaximumFractionDigits(2);

		double fahrenheit = 0.0;

		double celsius = 0.0;

		fahrenheit = 83.6;
		celsius = (fahrenheit - 32) * (5.0 / 9.0);

		System.out.println("Tempeature in Fahrenheit: " + df.format(fahrenheit) + " is: " + df.format(celsius) + " °C Celsius");

		fahrenheit = 15.9;
		celsius = (fahrenheit - 32) * (5.0 / 9.0);

		System.out.println("Tempeature in Fahrenheit: " + df.format(fahrenheit) + " is: " + df.format(celsius) + " °C Celsius");
	}

}
