package application;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
		return "Person [name=" + name + " \\ age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		if (this.name.equals(o.name)) {
			if(o.age > this.age) {
				return -1;
			}else if(o.age == this.age) {
				return 0;
			}else {
				return 1;
			}
		}else {
			return name.compareTo(o.name);
		}
		 
	}
	
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var people = new ArrayList<Person>();
		people.add(new Person("Dora",22));
		people.add(new Person("Joe", 44));
		people.add(new Person("Macie",88));
		people.add(new Person("Dora",29));		
		people.add(new Person("Leslie",17));	
		people.add(new Person("Leslie",45));	
		people.add(new Person("Barbie",40));	
		
		people.forEach(System.out::println);
		System.out.println();
			
		Collections.sort(people); // has Comparable interface now		
		System.out.println("Sorted:");
		people.forEach(System.out::println);
		
		
		people.set(2, new Person("Barbie",54));
		Collections.sort(people); // has Comparable interface now	
		
		System.out.println();
		System.out.println("Replacement:");
		people.forEach(System.out::println);
		String str1 = "ab";
		String str2 = "fbfg";
		String str3 = "ebfg";
		
		System.out.println(str1.compareTo(str2)); // a compared to f is 5 lower = -5
		System.out.println(str2.compareTo(str1)); // f compared to a is 5 higher = +5 
		System.out.println(str2.compareTo(str3)); // f compared to e is 1 higher = 1

	}

}
