package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cat[] cats = {new HouseCat(), new Tiger(), new Lion()};		
//		
//		for(Cat cat:cats) {
//			cat.vocalize();
//			cat.hunt();
//		}
		
		//Subtype Polymorphism
		//Cat cat1 = new Tiger(); //error runtime!
		Cat cat1 = new HouseCat(); 
		cat1.vocalize();
		cat1.hunt();
		//cat1.purr(); doesn't work
		((HouseCat)cat1).purr();	//Casting
		
		System.out.println();
		
		HouseCat cat2 = new HouseCat();
		cat2.vocalize();
		cat2.hunt();
		cat2.purr();
		
		System.out.println();
		
		Cat cat3 = new Lion();
		cat3.vocalize();
		cat3.hunt();
	}

}
