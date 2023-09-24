package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Sigmund");
		p1.display();
		
		// Person.Printer printer = new Person.Printer();  non static inner class are bound to an instance
		Person.Printer printer = p1.new Printer();
		
		printer.print();
	}

}
