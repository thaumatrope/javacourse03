package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		long start1 = System.currentTimeMillis();

		// @Formatter:off
		var wordMap = 
			Files
			.lines(Paths.get("Great Expectations.txt"))
			.map(l -> l.split("[^a-zA-Z]+"))
			.map(Arrays::asList)
			.flatMap(s -> s.parallelStream())
			.filter(s -> !s.isBlank())
			.map(String::toLowerCase)
			.collect(
					() -> new CountMap(), // supplier (creates collection)
					CountMap::combine, // accumulator (collection with first parameter)
					CountMap::combine // combiner - multi threading (combines two collections)
			);

		// @Formatter:on
		// @Formatter:off
		var list = wordMap
			.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue((v1,v2)->v2.compareTo(v1)))
			.collect(Collectors.toList());
		// @Formatter:on
		int i = 0;
		for(var entry:list) {
			if(i++ % 5 == 0) System.out.println();
			System.out.printf("%-10s : %5d\t",entry.getKey() , entry.getValue());
		}
		System.out.println();

		System.out.println("Map size: " + wordMap.size());

		long end1 = System.currentTimeMillis();
		System.out.println("Elapsed Time in milli seconds: " + (end1 - start1));

	}

}
