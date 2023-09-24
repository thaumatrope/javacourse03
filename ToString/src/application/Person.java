package application;

public class Person {
	private String name;
	private int age;
	private double height;

	// Constructor
	public Person() {
		System.out.println("Created a person....");

		// intial values
		name = "?";
		age = 0;
		height = 0;
	}

	public Person(String name, double height, int age) {
		System.out.println("Created a person with all properties....");
		this.name = name;
		this.height = height;
		this.age = age;

	}

	public String toString() {
		return "Name: " + name + ", height: " + height + ", age: " + age;

	}

	public void setName(String text) {
		this.name = text;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int number) {
		this.age = number;
	}

	public int getAge() {
		return this.age;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

}
