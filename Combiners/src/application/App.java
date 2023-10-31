package application;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@formatter:off
		var result = Stream.of("hello", "how", "are", "you")
				.parallel()
				.reduce("",
						(partial, item)-> partial + " " + item,
						(partial, partialb)->partial + partialb
						);
		//@formatter:on
		
		System.out.println(result);
	}

}
