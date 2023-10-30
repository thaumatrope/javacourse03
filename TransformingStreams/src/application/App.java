package application;

import java.util.ArrayList;
import java.util.List;

class Person{
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
		return "Person: " + name;
	}
	
}
public class App {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var names = List.of("Silvia", "Emma", "Charlotte", "Sophia", "Aria", "Ava", "Chloe", "Zoey", "Abigail", "Amilia");
		
		names.stream().forEach(System.out::println);
		System.out.println();
//		names.stream().map(s -> new Person(s)).forEach(System.out::println);
		names.stream().map(Person::new).forEach(System.out::println);
		System.out.println();
		names.stream().forEach(System.out::println);

//		ArrayList<Person> people = names.stream().map(s -> new Person(s));
	}

}
