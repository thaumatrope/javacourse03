package application;

import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		
		var numbers = new ArrayList<Integer>(List.of(1,6,4,7,3,6,3));
//		numbers.removeIf(n -> n < 5);
//		numbers.replaceAll(n -> n * 2);
//		numbers.forEach(System.out::println);
		numbers.removeIf(App::remove);
		numbers.replaceAll(App::replace);
		numbers.forEach(System.out::println);
	}
	
	private static boolean remove(Integer n){
		return n < 5;
	}
	private static int replace(Integer n){
		return n * 2;
	}
		


}
