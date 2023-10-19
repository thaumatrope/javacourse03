package application;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> months1 = new HashMap<>();
		
		months1.put(1, "Jan");
		months1.put(2, "Feb");
		
		months1.forEach((k,v)->{
			System.out.println(k + " : " + v);
		});
		
		// no Map literals yet in Java, no JSON
		//@formatter:on
		HashMap<Integer, String> months2 = new HashMap<>(Map.of(
				3,"Mar",
				4,"Apr"
		));  // key, value pairs, maximum 10 values
		//@formatter:off
		months2.forEach((k,v)->{
			System.out.println(k + " : " + v);
		});
		
		//static entry method of maps
		//@formatter:on
		HashMap<Integer, String> months3 = new HashMap<>(Map.ofEntries(
				entry(5, "May"),
				entry(6, "Jun")
		)); // no arg limits
		//@formatter:off
		months3.forEach((k,v)->{
			System.out.println(k + " : " + v);
		});
	}

}
