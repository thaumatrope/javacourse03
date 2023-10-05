package application;

import collections.Pair;
import collections.Wrapper;
import hierarchy.Cat;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Wrapper<Cat> wrapper = new Wrapper<Cat>();
		Wrapper<Mammal> wrapper = new Wrapper<Mammal>();
		
		Cat cat = new Cat("Joe");
		
		wrapper.setObject(cat);
		wrapper.setObject(new Mammal("Tiger"));
		
//		Cat retrieved = wrapper.getObject(); 
		Mammal retrieved = wrapper.getObject(); 
		System.out.println(retrieved);
		
		Mammal mammal = new Mammal("Suzie");
		
		Pair<Mammal, Cat> team = new Pair<Mammal, Cat>(mammal, cat);
		
		
		
		System.out.println(team.toString());
	}

}
