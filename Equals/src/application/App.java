package application;

import java.util.Objects;

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return Objects.equals(name, other.name);
//	}
//	

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (!(other instanceof Person)) {
			return false;
		}
		if (this.name == null) {
			return false;
		}
		Person p = (Person) other;
		if (p.name == null) {
			return false;
		}
		return name.equals(p.name);

	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("Joe");
		Person p2 = new Person("Joe");

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

	}

}
