package application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
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
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap, LinkedHashMap, TreeMap
		// functions that accepts a map, adds items to the map and prints the map.
		// Person is the key, value is free to the likes

		Person p1 = new Person("Pauly");
		Person p2 = new Person("Suzie");
		Person p3 = new Person("Fiddle");

		Map mapHash = new HashMap<Person, Integer>();
		Map mapLinkedHash = new LinkedHashMap<Person, Integer>();
		Map mapTree = new TreeMap<Person, Integer>();
		System.out.println("HashMap");
		add(mapHash, p1, 44);
		add(mapHash, p2, 7);
		add(mapHash, p3, 99);
		System.out.println("LinkedHashMap");
		add(mapLinkedHash, p1, 44);
		add(mapLinkedHash, p2, 7);
		add(mapLinkedHash, p3, 99);
		System.out.println("TreeMap");
		add(mapTree, p1, 44);
		add(mapTree, p2, 7);
		add(mapTree, p3, 99);

	}

	public static void add(Map map, Person person, int age) {

		map.put(person, age);

		map.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});

	}

}
