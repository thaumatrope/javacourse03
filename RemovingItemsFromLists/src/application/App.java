package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Cat{
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	 @Override
	public String toString() {
		return this.name;
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
		Cat other = (Cat) obj;
		return Objects.equals(name, other.name);
	}
}

public class App {
	
	public static void main(String[] args) {
		
		Cat tiddles = new Cat("Tiddles");
		
		List<Cat> cats = new ArrayList<Cat>(List.of(new Cat("Tiddles"), tiddles, new Cat("Bertie"), new Cat("Mathilda"), tiddles));
		
		cats.forEach(System.out::println);				
		cats.remove(1);	// remove via index
		System.out.println("----------");
		cats.forEach(System.out::println);		
		
		cats.add(new Cat("Shmusy"));
		
		System.out.println("----------");
		cats.forEach(System.out::println);	
		cats.remove(tiddles);  // remove via object references --> look at equals method
		System.out.println("----------");
		cats.forEach(System.out::println);
	}
}
