package application;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Stream.of(1,2,3).forEach(System.out::println);
		System.out.println();
		
		//endless stream
		Stream.generate(()->"Hello").limit(4).forEach(System.out::println);
		System.out.println();
		
		// from Collections
		List.of(1,2,3,4).stream().forEach(System.out::println);
	}

}
