package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {

	static private Integer AMOUNT = 100_000; // or AMOUNT = 1E5
	static private long timeUsed = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers1 = new ArrayList<>();
		timeUsed = populateList(numbers1);
		System.out.println("ArrayList with " + AMOUNT + " numbers generated in: " + timeUsed + " milliseconds.");

		List<Integer> numbers2 = new ArrayList<>();
		timeUsed = populateListAtZero(numbers2);
		System.out
				.println("ArrayList with " + AMOUNT + " numbers add ZERO generated in: " + timeUsed + " milliseconds.");

		List<Integer> numbers3 = new LinkedList<>();
		timeUsed = populateList(numbers3);
		System.out.println("LinkedList with " + AMOUNT + " numbers generated in: " + timeUsed + " milliseconds.");

		List<Integer> numbers4 = new LinkedList<>();
		timeUsed = populateList(numbers4);
		System.out.println(
				"LinkedList with " + AMOUNT + " numbers add ZERO  generated in: " + timeUsed + " milliseconds.");

		List<Integer> numbers5 = new LinkedList<>();
		List<Integer> numbers6 = new ArrayList<>();
		List<Integer> list = numbers6;
		
//		 BIG O Notation for time duration depended on number of items passed to the function/algorithm
//		 O(1)	  ideal 1, which never happens
//		 O(n)	  linear
//		 O(n^2) squared
//		 O(c^n) exponential

		try (var bw = new BufferedWriter(new FileWriter("timing.txt"))) {

			for (int numberItems = 0; numberItems < 1E6; numberItems += 50000) {
				for (int i = 0; i < numberItems; i++) {
					list.add(i);
				}

				long duration = timeOperations1(list);				
				String info1 = String.format("%d\t%d\n", numberItems, duration);
				
				duration = timeOperations2(list);				
				String info2 = String.format("%d\t%d\n", numberItems, duration);
				
				bw.write(info1);
				System.out.print("Add(0,10):" + info1);
				System.out.print("Iterate  :" + info2);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static long timeOperations1(List<Integer> list) {

		long timeStart = System.currentTimeMillis();

		list.add(0, 10);

		return (System.currentTimeMillis() - timeStart);

	}
	
	public static long timeOperations2(List<Integer> list) {

		long timeStart = System.currentTimeMillis();

		for(var o:list) {
			
		}

		return (System.currentTimeMillis() - timeStart);

	}

	public static long populateList(List<Integer> list) {

		long timeStart = System.currentTimeMillis();
		Random random = new Random();

		for (int i = 0; i < AMOUNT; i++) {
			list.add(random.nextInt());
		}

		return (System.currentTimeMillis() - timeStart);

	}

	public static long populateListAtZero(List<Integer> list) {

		long timeStart = System.currentTimeMillis();
		Random random = new Random();

		for (int i = 0; i < AMOUNT; i++) {
			list.add(0, random.nextInt());
		}

		return (System.currentTimeMillis() - timeStart);

	}

}
