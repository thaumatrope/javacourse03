package application;

public class Thermostat {
	
	// no throws declaration with Runtime Exceptions

	public void setTemperature(double temperature) {
		
		setMachineTemperature(temperature);
	
		System.out.println("Setting temerature to " + temperature);
	}
	
	private void setMachineTemperature(double temperature) {
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("Temperature out of range!");
		}
	}
}
