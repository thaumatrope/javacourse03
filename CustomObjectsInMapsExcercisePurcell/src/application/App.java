package application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Person implements Comparable<Person>{

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap, LinkedHashMap, TreeMap
		// functions that accepts a map, adds items to the map and prints the map.
		// Person is the key, value is free to the likes

		

		Map mapHash = new HashMap<Person, Integer>();
		Map mapLinkedHash = new LinkedHashMap<Person, Integer>();
		Map mapTree = new TreeMap<Person, Integer>();
		System.out.println("HashMap");
		add(mapHash);
		System.out.println("LinkedHashMap");
		add(mapLinkedHash);
		System.out.println("TreeMap");
		add(mapTree);

	}

	public static void add(Map<Person, Integer> map) {
		
		Person p1 = new Person("Pauly");
		Person p2 = new Person("Suzie");
		Person p3 = new Person("Fiddle");
		Person p4 = new Person("Suzie");
		map.put(p1, 44);
		map.put(p2, 7);
		map.put(p3, 99);
		map.put(p4, 21);

		map.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});

	}

}
