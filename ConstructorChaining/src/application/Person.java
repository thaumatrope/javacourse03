package application;

public class Person {
	
	private String name;
	private int age;
	private static final String NO_NAME = "<not supplied>";
	
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
		this(NO_NAME, 0);
		// default values

	}
	
	public Person(String name) {
		this(name, 0);

	}
	
	public Person(int age) {
		this(NO_NAME, age);

	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Parameter constructor");
		System.out.println("New person created with name " + name + " and age " + age + ".");
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
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
