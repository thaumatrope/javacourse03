package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// IntStream has two versions of reduce
		System.out.println(IntStream.range(0, 10).count());
		System.out.println(IntStream.range(0, 10).sum());
		
		var value1 = IntStream.range(0, 10).reduce(2, (subtotal, item)->subtotal + item); // starts at 2
		System.out.println(value1);
		
		var value2 = IntStream.range(0, 10).reduce((subtotal, item)->subtotal + item); // starts at first element
		System.out.println(value2);
	}

}
