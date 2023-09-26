package application;

import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thermostat stat = new Thermostat();
		
		
		try{
			stat.setTemperature(100.0);
			
		} catch (TemperatureTooLowException e) {
			System.out.println("The temperature was set too low.");
			
			//get message from throw Exception
			System.out.println(e.getMessage());
			
			//print stack trace
			e.printStackTrace();
		} catch (TemperatureTooHighException e) {
			System.out.println("The temperature was set too high.");
			
			//get message from throw Exception
			System.out.println(e.getMessage());
			
			//print stack trace
			e.printStackTrace();
		}
		
	}

}
