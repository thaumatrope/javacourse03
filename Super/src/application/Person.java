package application;

public class Person {
	private String name;
	
	public Person(String name) {
		System.out.println("Person-Constructor");
	}

	public String toString() {
		return name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
