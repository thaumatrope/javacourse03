package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
	
	static private Integer AMOUNT = 400_000; // or AMOUNT = 1E5
	static private long timeStart = 0;
	static private long timeEnd = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers1 = new ArrayList<>();
		timeStart = System.currentTimeMillis();
		populateList(numbers1);
		timeEnd = System.currentTimeMillis();
		System.out.println("ArrayList with " + AMOUNT + " numbers generated in: " + (timeEnd - timeStart) + " milliseconds.");
		System.out.println(numbers1.get(2345));
		System.out.println(numbers1.get(82245));
		
		List<Integer> numbers2 = new ArrayList<>();
		timeStart = System.currentTimeMillis();
		populateListAtZero(numbers2);
		timeEnd = System.currentTimeMillis();
		System.out.println("ArrayList with " + AMOUNT + " numbers add ZERO generated in: " + (timeEnd - timeStart) + " milliseconds.");
		System.out.println(numbers2.get(145));
		System.out.println(numbers2.get(99245));

		List<Integer> numbers3 = new LinkedList<>();
		timeStart = System.currentTimeMillis();
		populateList(numbers3);
		timeEnd = System.currentTimeMillis();
		System.out.println("LinkedList with " + AMOUNT + " numbers generated in: " + (timeEnd - timeStart) + " milliseconds.");
		System.out.println(numbers3.get(2345));
		System.out.println(numbers3.get(82245));
		
		List<Integer> numbers4 = new LinkedList<>();
		timeStart = System.currentTimeMillis();
		populateList(numbers4);
		timeEnd = System.currentTimeMillis();
		System.out.println("LinkedList with " + AMOUNT + " numbers add ZERO  generated in: " + (timeEnd - timeStart) + " milliseconds.");
		System.out.println(numbers4.get(2345));
		System.out.println(numbers4.get(82245));
	}
	
	public static List<Integer> populateList(List<Integer> list){
		
		Random random = new Random();
		
		for( int i = 0; i < AMOUNT; i++) {
			list.add(random.nextInt());
		}		
		
		return list;
		
	}
	
public static List<Integer> populateListAtZero(List<Integer> list){
		
		Random random = new Random();
		
		for( int i = 0; i < AMOUNT; i++) {
			list.add(0, random.nextInt());
		}		
		
		return list;
		
	}

}
