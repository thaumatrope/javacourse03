package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(IntStream.range(0, 10).count());
		System.out.println(IntStream.range(0, 10).sum());
		
		var value1 = IntStream.range(0, 10).reduce(0, (subtotal, item)->subtotal + item); // starts at 0
		System.out.println(value1);
		
		var value2 = IntStream.range(0, 10).reduce((subtotal, item)->subtotal + item); // starts at first element
		System.out.println(value2);
	}

}
