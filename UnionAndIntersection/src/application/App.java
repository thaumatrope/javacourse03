package application;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var fruits1 = new HashSet<String>(Set.of("apple","banana","cherry","pear"));
		var fruits2 = new HashSet<String>(Set.of("raspberry","apple","blackberry","cherry"));
		
		var union = new HashSet<String>(fruits1);
		union.addAll(fruits2); // union (gemeinsame Menge)
		
		union.forEach(System.out::println);
		
		System.out.println();
		
		var intersection = new HashSet<String>(fruits1);
		intersection.retainAll(fruits2);  // intersection (Schnittmenge)
		
		intersection.forEach(System.out::println);
		
		System.out.println();
		
		var subset = new HashSet<String>(fruits1); // subset (Teilmenge)
		subset.removeAll(fruits2);
		
		subset.forEach(System.out::println);
		
	}

}
