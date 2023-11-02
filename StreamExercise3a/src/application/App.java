package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;

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

		wordMap.forEach((s, n) -> System.out.printf("%-20s occurs: %d times\n", s, n));

		System.out.println("Map size: " + wordMap.size());

		long end1 = System.currentTimeMillis();
		System.out.println("Elapsed Time in milli seconds: " + (end1 - start1));

	}

}
