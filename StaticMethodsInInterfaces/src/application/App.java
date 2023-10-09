package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.run();  //static method of Interface
		
		//new way of adding stuff
		List<Integer> list1 = new ArrayList<>(List.of(20,19,18,13));
		List<Integer> list2 = new ArrayList<>(list1);
		List<Integer> list3 = new ArrayList<>();
		
		//old way of adding stuff
		list1.add(34);
		list1.add(0);
		list1.add(7);
		list1.add(34);
		
		//new way of adding stuff
		list3.add(333);
		list3.addAll(list2);
		list3.add(444);
		
		System.out.println("List 1:");
		
		for(var n:list1) {
			System.out.println(n);
		}
		System.out.println("List 2:");
		for(var n:list2) {
			System.out.println(n);
		}
		System.out.println("List 3:");
		for(var n:list3) {
			System.out.println(n);
		}
		
	}

}
