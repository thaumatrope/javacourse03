package application;

import java.util.ArrayList;
import java.util.List;

class Person {

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

}

@FunctionalInterface
interface NameGetter {
	String get(Person p);

}

@FunctionalInterface
interface NameSetter {
	void set(Person p, String name);

}
public class App {

	public static void main(String[] args) {

		Person person = new Person("Joe");
		
		NameGetter getter1 = p -> p.getName();
		System.out.println(getter1.get(person));
		
		NameGetter getter2 = Person::getName;
		System.out.println(getter2.get(person));
		
//		NameSetter setter1 = (p,s) -> p.setName(s);
		NameSetter setter1 = Person::setName;
		setter1.set(person, "Mike");
		System.out.println(getter1.get(person));
	}

}
