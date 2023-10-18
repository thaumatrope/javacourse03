package application;

import java.util.TreeSet;

class Person implements Comparable<Person>{

	private String name;

	public Person(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

//	@Override
//	public int compareTo(Person o) {
//		// TODO Auto-generated method stub
//		return name.compareTo(o.name);
//	}
	
	// reversed
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return o.name.compareTo(name);
	}
	
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet <Person> people = new TreeSet<Person>();
		
		boolean added = people.add(new Person("Ethel"));
		people.add(new Person("Albert"));
		people.add(new Person("Sally"));
		people.add(new Person("Mel"));
		
		System.out.println(added);
		System.out.println();
		
		for(var person:people) {
			System.out.println(person);
		}
	}

}
