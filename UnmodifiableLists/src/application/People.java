package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class People {

	private List<String> people = new ArrayList<>();
	
	public People(){
		people.add("Bob");
		people.add("Mary");
		people.add("Lisa");
		
	}
	
	public List<String> get(){
		return Collections.unmodifiableList(people);
	}
}
