package application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@formatter:off
		HashMap<String, String> months = new HashMap<>(Map.of(
				"JAN", "January",
				"FEB", "February",
				"MAR", "March",
				"APR", "April",
				"JUN", "June",
				"JUL", "July"
				));
		
		//@formatter:on
		// Lambda
		months.forEach((monthCode,monthName)->{
			System.out.println(monthCode + " : " + monthName);
		});
		
		System.out.println();
		// entrySet() with var
		for(var entry: months.entrySet()) {
			var monthCode = entry.getKey();
			var monthName = entry.getValue();
			System.out.println(monthCode + " : " + monthName);
			
		}
		
		System.out.println();
		
		// entrySet() - older Java Code - Entry is kind of Inner class of Map
		for(Map.Entry<String, String> entry: months.entrySet()) {
			var monthCode = entry.getKey();
			var monthName = entry.getValue();
			System.out.println(monthCode + " : " + monthName);
			
		}
		
		System.out.println();
		// keySet() not very efficient
		for(var monthCode: months.keySet()) {
			var monthName = months.get(monthCode);
			System.out.println(monthCode + " : " + monthName);
			
		}
		System.out.println();
		
		// iterator - very popular in the past
		var it = months.entrySet().iterator();
		// aka Iterator<Map.Entry<String, String>> iter = months.entrySet().iterator();
		
		while(it.hasNext()) {
			var entry = it.next();
			var monthCode = entry.getKey();
			var monthName = entry.getValue();
			System.out.println(monthCode + " : " + monthName);
			
		}
	}

}
