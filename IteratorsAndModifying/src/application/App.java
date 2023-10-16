package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	
	

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4));
		numbers.forEach(System.out::println);
		
		System.out.println("--------------");
		
		for(var it = numbers.listIterator(); it.hasNext();) {
			var number = it.next();  // iterator retrieves the current item AND moves forward to the next item
			
			if(number == 2) {
				it.remove();		 // iterator operates on the previous item 
			} else if(number == 3) {
				it.add(10);			// iterator operates on the previous item 
			} else if(number == 1) {
				it.set(100);		// iterator operates on the previous item 
			}
			System.out.println(number);
			
		}

		System.out.println("--------------");
		numbers.forEach(System.out::println);
			
			

	}

}
