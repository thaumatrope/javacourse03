package application;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(78);
		list.add(166);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// first way of iterating
		for(Integer i:list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//second way
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		//third way
		list.forEach(System.out::print);
		System.out.println();
		
		//fourth way
		list.forEach(e->{
			System.out.print(e + " ");
		});
		System.out.println();
	}

}
