package application;

import java.util.stream.LongStream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		var factorial = LongStream.range(1, 11).reduce((subtotal, item)->subtotal * item);
		System.out.println(factorial.getAsLong());
	}

}
