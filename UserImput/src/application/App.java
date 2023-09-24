package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value in Fahrenheit to convert > ");

		double fahrenheit = scanner.nextFloat();
		scanner.close();

		double celsius = (fahrenheit - 32) * (5.0 / 9.0);

		System.out.println(fahrenheit + " °F is " + celsius + " °C.");
		System.out.printf("%.1f °F is %.1f °C.", fahrenheit, celsius);

	}

}
