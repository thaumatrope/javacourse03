package application;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	
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
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
		 
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
		System.out.println();
		
		Collections.sort(people); // has Comparable interface now		
		
		people.forEach(System.out::println);
		
		String str1 = "ab";
		String str2 = "fbfg";
		String str3 = "ebfg";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		System.out.println(str2.compareTo(str3));

	}

}
