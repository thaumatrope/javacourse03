package application;

import java.util.HashSet;
import java.util.Objects;

class Creature{
	private int id;
	private String name;
	
	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + ": " + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id;
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
		HashSet<Creature> creatures = new HashSet<>();
		
		creatures.add(new Creature(0, "Bear"));
		creatures.add(new Creature(1, "Cat"));
		creatures.add(new Creature(2, "Mouse"));
		creatures.add(new Creature(3, "Ape"));
		creatures.add(new Creature(2, "Bear"));
		
//		for(var c: creatures) {
//			System.out.println(c);
//		}
		
		// only with implemented methods of hashCode() and equals() duplicates are avoided as you want
		creatures.forEach(System.out::println);
		
	}
}
