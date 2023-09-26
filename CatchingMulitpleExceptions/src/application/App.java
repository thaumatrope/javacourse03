package application;

import application.exceptions.TemperatureOutOfRangeException;
import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thermostat stat = new Thermostat();

		//two catch blocks
		try {
			stat.setTemperature(100.0);

		} catch (TemperatureTooLowException e) {
			System.out.println("The temperature was set too low.");

			// get message from throw Exception
			System.out.println(e.getMessage());

			// print stack trace
			e.printStackTrace();
		} catch (TemperatureTooHighException e) {
			System.out.println("The temperature was set too high.");

			// get message from throw Exception
			System.out.println(e.getMessage());

			// print stack trace
			e.printStackTrace();
		} // in order to catch other more unspecific exceptions, more general must be placed lower
		catch (Exception e) {
			// catch all other exceptions here
		}
		
		//two catch blocks with OR
		try {
			stat.setTemperature(100.0);

		} catch (TemperatureTooLowException | TemperatureTooHighException e) {

			// get message from throw Exception
			System.out.println(e.getMessage());

			// print stack trace
			e.printStackTrace();		
		}


		// catch with superclass
		try {
			stat.setTemperature(100.0);

		} catch (TemperatureOutOfRangeException e) {

			// get message from throw Exception
			System.out.println(e.getMessage());

			// print stack trace
			e.printStackTrace();
		}

		// catch with exception
		try {
			stat.setTemperature(100.0);

		} catch (Exception e) {

			// get message from throw Exception
			System.out.println(e.getMessage());

			// print stack trace
			e.printStackTrace();
		}
	}

}
