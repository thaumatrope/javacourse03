package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class App {	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		long start2 = System.currentTimeMillis();
	    
		//@Formatter:off
		var list = Files.
		lines(Paths.get("Great Expectations.txt")).
		map(l->l.split("[^a-zA-Z]+")).
		map(Arrays::asList).
		flatMap(s->s.stream()).
		collect(Collectors.toList());
		
		Set<String> set = new HashSet<>(list);		
		
		var myMap = set.parallelStream().collect(
				()->new TreeMap<String, Integer>(),									// supplier (creates collection)
				(map, item) -> map.put(item, Collections.frequency(list, item)),	// accumulator (collection with first parameter)
				(map1, map2) -> map1.putAll(map2)); 								// combiner - multi threading (combines two collections)
				
		myMap.forEach((s,n)-> System.out.println("Key: " + s + " occurs: " + n + " times"));
		
		System.out.println("Map size: " + myMap.size());
		System.out.println("Set size: " + set.size());
		System.out.println("List size: " + list.size());
		//@Formatter:on
		
		 long end2 = System.currentTimeMillis();      
	     System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));
	

	}
}
