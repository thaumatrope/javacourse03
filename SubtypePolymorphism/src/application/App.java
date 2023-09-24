package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat[] cats = {new HouseCat(), new Tiger(), new Lion()};		
		
		for(Cat cat:cats) {
			cat.vocalize();
			cat.hunt();
		}
		
		//Subtype Polymorphism
//		Cat cat1 = new HouseCat();
//		cat1.vocalize();
//		cat1.hunt();
//		
//		Cat cat2 = new Tiger();
//		cat2.vocalize();
//		cat2.hunt();
//		
//		Cat cat3 = new Lion();
//		cat3.vocalize();
//		cat3.hunt();
	}

}
