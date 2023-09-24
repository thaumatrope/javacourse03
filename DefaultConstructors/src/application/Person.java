package application;

public class Person {
	
	private String name;
	private int age;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	public Person() {
		System.out.println("No parameter constructor");
		System.out.println("New person created.");
	}
	
	public Person(String name) {
		System.out.println("Parameter constructor");
		this.name = name;		
		System.out.println("New person created with name " + name + ".");
	}
	
	public Person(String name, int age) {
		System.out.println("Parameter constructor");
		this.name = name;
		this.age = age;
		System.out.println("New person created with name " + name + ".");
	}
	
	@Override
	public String toString() {
		return "Hello";
	}
	
	public void greet() {
		System.out.println("Hello");
	}
	
	public void greet(String nameToGreet) {
		System.out.println("Hello " + nameToGreet);
	}
	
	public void greet(int height) {
		if(height > 185){
			System.out.println("You are very tall.");
		}
	}
	
	public void greet(String name, int height) {
		if(height > 185){
			System.out.print("You are very tall. ");
		}
		System.out.println("Hello " + name);
	}
}
