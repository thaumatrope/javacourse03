package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;


// cannot be extended
final class Person {
	
	
}

//not possible!
//public class Employee extends Person {
//	
//}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit fruit1 = new Apple();
		Fruit fruit2 = new Banana();
		//fruit1.id = 6;  is protected
		
		System.out.println(fruit1);
		
		
		System.out.println(fruit2);
	}

}
