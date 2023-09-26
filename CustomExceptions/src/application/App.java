package application;

import application.exceptions.TemperatureOutOfRangeException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thermostat stat = new Thermostat();
		
		
		try{
			stat.setTemperature(100.0);
			
		} catch (TemperatureOutOfRangeException e) {
			System.out.println("The temperature was set incorrectly.");
			
			//get message from throw Exception
			System.out.println(e.getMessage());
			
			//print stack trace
			e.printStackTrace();
		}
		
	}

}
