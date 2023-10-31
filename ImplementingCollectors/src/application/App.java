package application;

import java.util.ArrayList;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@formatter:off
		var result = Stream.of("one", "two", "three", "four")
				.collect(
						()->new ArrayList<String>(),				// supplier (creates collection)
						(list, item) -> list.add(item),				// accumulator (collection with first parameter)
						(list1, list2) -> list1.addAll(list2)); 	// combiner - multi threading (combines two collections)
		//@formatter:on
		
		System.out.println(result);
	}

}
