package application;

@FunctionalInterface
public interface Test {
	
	public void run();
	
	//public void sound(); doesn't work with Functional Interface as it is a second method

	public default void sound() {  // default methods do work in Functional Interfaces
		
	}; 
	
	static void light() {  // static methods also work in Functional Interfaces
		
	}
}
