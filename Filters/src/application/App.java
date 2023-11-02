package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class App {	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		long start1 = System.currentTimeMillis();
	    
		//@Formatter:off
		var wordMap = Files.
		lines(Paths.get("Great Expectations.txt")).
//		map(l->l.toLowerCase().split("[^a-zA-Z]+")).
		map(l->l.split("[^a-zA-Z]+")).
		map(Arrays::asList).
		flatMap(s->s.parallelStream()).
		filter(s -> !s.isBlank()).
		map(String::toLowerCase).
		collect(
			()->new TreeMap<String, Integer>(),		// supplier (creates collection)
			App::accumulate,						// accumulator (collection with first parameter)
			App::combine 							// combiner - multi threading (combines two collections)
		); 				
				
		//@Formatter:on		
		
				
		wordMap.forEach((s,n)-> System.out.printf("%-20s occurs: %d times\n",s, n));
		
		System.out.println("Map size: " + wordMap.size());		
		
		 long end1 = System.currentTimeMillis();      
	     System.out.println("Elapsed Time in milli seconds: "+ (end1-start1));
	
	}
	private static void accumulate(Map<String,Integer> map, String word) {
										
			Integer count = map.get(word);
			if(count == null) {
				map.put(word, 1);
			}else {
				map.put(word, count + 1);
			};	
	}
	public static void combine(Map<String, Integer> map1, Map<String,Integer> map2) {
		
		map2.forEach((word, count2) -> {
			Integer count1 = map1.get(word);
			if(count1 == null) {
				map1.put(word, count2);
			}else {
				map1.put(word, count1 + count2);
			}
		});
		
	}
}
