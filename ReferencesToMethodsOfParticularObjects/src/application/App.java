package application;

import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		
		App app = new App();
		
		var numbers = new ArrayList<Integer>(List.of(1,6,4,7,3,6,3));

		numbers.removeIf(app::remove);
		numbers.replaceAll(app::replace);
//		numbers.forEach(System.out::println);
		numbers.forEach(app::print);
	}
	
	private boolean remove(Integer n){
		return n < 5;
	}
	private int replace(Integer n){
		return n * 2;
	}
	
	private void print(int value) {
		System.out.println("Got value: " + value);
	}
		


}
