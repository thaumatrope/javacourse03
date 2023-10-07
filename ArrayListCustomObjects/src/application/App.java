package application;

import java.util.ArrayList;

class Person{
	
	private String name;
	
	public Person(String name) {
		this.setName(name);
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

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var people = new ArrayList<Person>();
		people.add(new Person("Joe"));
		people.add(new Person("Macie"));
		people.add(new Person("Dora"));
		people.add(new Person("Leslie"));
		
		people.set(2, new Person("Suzie"));
		
		
		people.forEach(System.out::println);

	}

}
