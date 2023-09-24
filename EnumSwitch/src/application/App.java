package application;

//import java.awt.Color;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Color color;
		
		Fruit fruit1 = Fruit.APPLE;
		Fruit fruit2 = Fruit.ORANGE;
		
		switch(fruit1) {
		case ORANGE:
			System.out.println("Case - ORANGE");
			break;
		case APPLE:
			System.out.println("Case - APPLE");
			break;
		case BANANA:
			System.out.println("Case - BANANA");
			break;
		default:
			System.out.println("Case - not found");
			break;
		}
	}

}
