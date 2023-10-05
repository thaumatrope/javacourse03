package application;

import collections.Wrapper;
import hierarchy.Cat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wrapper wrapper = new Wrapper();
		
		Cat cat = new Cat("Joe");
		
		wrapper.setObject(cat);
		
		Cat retrieved = (Cat) wrapper.getObject(); 
		System.out.println(retrieved);
	}

}
