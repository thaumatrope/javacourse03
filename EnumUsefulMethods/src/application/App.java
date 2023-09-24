package application;

//import java.awt.Color;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Color color;
		
		Fruit[] fruits = Fruit.values();
		
		for(Fruit fruit:fruits) {
			System.out.println(fruit);
		}
		
		for(Fruit fruit:Fruit.values()) {
			System.out.println(fruit);
		}
		
		System.out.println(Fruit.BANANA.ordinal());
		
		Fruit fruit2 = Fruit.valueOf("ORANGE");
		
		System.out.println(fruit2);
		
		System.out.println(fruit2 == Fruit.ORANGE);
		
	}

}
