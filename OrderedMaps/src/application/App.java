package application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashSet, LinkedHashSet, TreeSet
		// HashMap, LinkedHashMap, TreeMap
		
		LinkedHashMap<Integer, String> months1 = new LinkedHashMap<>();  //ordered
		
		months1.put(3,  "Mar");
		months1.put(1,  "Jan");
		months1.put(6,  "Jun");
		
		months1.forEach((k,v)->{System.out.println(k + " : " + v);});
		
		System.out.println();
		TreeMap<Integer, String> months2 = new TreeMap<>();
		Map<Integer, String> months3 = new TreeMap<>();
		
		months2.put(3,  "Mar");
		months2.put(1,  "Jan");		
		months2.put(6,  "Jun");
		
		months2.forEach((k,v)->{System.out.println(k + " : " + v);});  //ordered and sorted
		
	}

}
