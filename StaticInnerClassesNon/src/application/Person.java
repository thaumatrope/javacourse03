package application;

//import application.Person.Printer;

public class Person {
	
	private String name;
	
	// non static inner class has access to instance variables and is therefore bound to an outer class instance
	public class Printer{
		public void print() {
			System.out.println(name);
		}
	}
	
	private class PrivatePrinter{
		public void print() {
			System.out.println(name);
		}
	}
	
	public Person(String name) {
		this.name = name;
		
	}
	
	public void display() {
		PrivatePrinter printer = new PrivatePrinter();
		printer.print();
	}

}
