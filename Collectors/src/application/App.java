package application;

import java.util.List;
import java.util.stream.Collectors;

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
		
		//@formatter:Off
//		names.stream().map(s -> new Person(s)).forEach(System.out::println);
		var list = names.stream().			//generator				
		map(Person::new).					// intermediate methods
		collect(Collectors.toList());		// terminal operation
		//@formatter:On
		
		System.out.println();
		for(var person:list) {
			System.out.print(person.getClass() + " | ");
			System.out.println("From list with twist: " + person);
		}
		
		System.out.println();
		System.out.println(names);

//		ArrayList<Person> people = names.stream().map(s -> new Person(s));
	}

}
