package application;

import java.util.ArrayList;
import java.util.Collections;

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
		
		//Collections.sort(people); not working yet
		
		System.out.println();
		
		ArrayList<Double>  numbers = new ArrayList<>();
		numbers.add(2.343);
		numbers.add(7.89);
		numbers.add(4.56);
		numbers.add(1.23);

		numbers.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(numbers);
		
		numbers.forEach(System.out::println);
		System.out.println();

	}

}
