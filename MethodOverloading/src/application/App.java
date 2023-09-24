package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.greet();
		person.greet("Joe");
		person.greet(190);
		person.greet("Susan", 200);
	}

}
