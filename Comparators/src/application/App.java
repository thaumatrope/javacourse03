package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person>{
	
	private String name;
	private Integer age;
	
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

class PersonReverseAlpha implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		// TODO Auto-generated method stub
		return person2.getName().compareTo(person1.getName());
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
	
		System.out.println();
		System.out.println("Reverse Sorted by Comparator:");
		Collections.sort(people, new PersonReverseAlpha());
		people.forEach(System.out::println);
		
		people.sort(new Comparator<Person>() {

			@Override
			public int compare(Person person1, Person person2) {
				// TODO Auto-generated method stub
				Integer value = person1.getAge();
				return value.compareTo(person2.getAge());
			}
			
		});
		System.out.println();
		System.out.println("Sorted by Comparator number:");
		people.forEach(System.out::println);
	
	}

}
