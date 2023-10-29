package application;

import java.util.ArrayList;
import java.util.List;

class Person implements Comparable{

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}


	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}


public class App {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>(List.of(new Person("Mary"), new Person("Barbie"), new Person("Joe")));
;
		people.forEach(System.out::println);
		System.out.println();
		people.sort(Person::compareTo);
		
		people.forEach(System.out::println);
		System.out.println();
		
		List<String> strings = new ArrayList<>(List.of("Banana", "Apple", "Orange", "kiwi"));
		strings.sort(String::compareTo);
		
		strings.forEach(System.out::println);
		System.out.println();
		
		strings.sort(String::compareToIgnoreCase);
		
		strings.forEach(System.out::println);
		

		
	
	}

}
