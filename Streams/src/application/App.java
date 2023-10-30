package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(); // Input-/Output streams <- different streams!! 
		
		// Streams here in terms of data structure streams
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,6,4,6,4,8,6));
		
		numbers.stream().forEach(i->System.out.println("Number is: " + i));
		
		
	}

}
