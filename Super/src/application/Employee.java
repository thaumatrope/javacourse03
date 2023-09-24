package application;

public class Employee extends Person{
	
	public Employee(String name) {
		super(name); //calls the Superclass Constructor - must be in the first line
		System.out.println("Employee-Constructor");
	}

}
