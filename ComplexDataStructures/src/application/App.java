package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Set<String>> setOfSets = new HashSet<>();
		
		Set<String> item1 = new TreeSet<>();
		setOfSets.add(item1);		
		item1.add("one");
		item1.add("two");
		
		Set<String> item2 = new TreeSet<>();
		setOfSets.add(item2);
		item2.add("Keyser");
		item2.add("Boobs");
		
		for(var set:setOfSets) {
			System.out.println(set);
		}
	}

}
