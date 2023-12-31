package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
			ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4));
			
			Iterator<Integer> it = numbers.iterator();
			
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			
			System.out.println("----------------");
			for(it = numbers.iterator(); it.hasNext();) {
				Integer number = it.next();
				System.out.println(number);
				
			}
			
			System.out.println("----------------");
			it = numbers.iterator();
			for(int i = 0; i < numbers.size(); i++) {
				System.out.println(it.next());
			}
			
			System.out.println("----------------");
			it = numbers.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			
			System.out.println("----------------");
			for(var n:numbers){
				System.out.println(n);
			}
			
			System.out.println("----------------");
			numbers.forEach(System.out::println);
				
			
			

	}

}
