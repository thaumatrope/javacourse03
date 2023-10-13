package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
			ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4));
			
			for(Iterator<Integer> it = numbers.iterator(); it.hasNext();) {
				Integer number = it.next();
				System.out.println(number);
				
			}

	}

}
