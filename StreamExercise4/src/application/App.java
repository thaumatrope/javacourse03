package application;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		
		//@formatter:off
		// TODO Auto-generated method stub
		// int variant
		IntStream.range(1, 13).forEach(n -> {
			IntStream.range(1, 13).forEach(k -> {
				int value = n * k;
				System.out.printf("%3d ", value);
			});				
			System.out.println();
		});
		
		
		// String variant
		var table = IntStream
		.range(1, 13)
		.mapToObj(n -> {
			return IntStream.range(1, 13)
			.map(k -> k*n)
			.mapToObj(Integer::toString)
			.map(s -> String.format("%4s", s))
			.collect(Collectors.joining());
		})
		.collect(Collectors.joining("\n"));
		
		System.out.println(table);
		
		//@formatter:on
	}

}
