package application;

import application.exceptions.TemperatureOutOfRangeException;
import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;

public class Thermostat {
	
	// no throws declaration with Runtime Exceptions

	public void setTemperature(double temperature) throws TemperatureTooLowException, TemperatureTooHighException  {
		
		setMachineTemperature(temperature);
	
		System.out.println("Setting temerature to " + temperature);
	}
	
	private void setMachineTemperature(double temperature) throws TemperatureTooLowException, TemperatureTooHighException  {
		if(temperature < 0) {
			throw new TemperatureTooLowException("Temperature is too low");
		} else if (temperature > 35) {
			throw new TemperatureTooHighException("Temperature is too high");
		}
	}
}
