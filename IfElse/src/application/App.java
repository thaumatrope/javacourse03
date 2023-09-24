package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter room temperature (F) > ");
		
		double temperatureFahrenheit = scanner.nextFloat();
		
		double temperatureCelsius = (temperatureFahrenheit - 32) * (5.0/9.0);
		
		System.out.printf("Temperature celsius: %.2f \n", temperatureCelsius);
		
		// If temperature in celsius less than 21, print "Too cold!"
		// If temperature in celsius is greater than 21, print "Warm enough.
		
		if (temperatureCelsius < 21) {
			System.out.println("Too cold!");
		} else if (temperatureCelsius > 21) {
			System.out.println("Warm enough.");
		}

	}

}
