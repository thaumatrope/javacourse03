package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cats = 43;
		int dogs = 23;
		int weasels = 43;
		
		boolean moreCatsThanDogs = cats > dogs;
		
		System.out.println("More Cats than dogs: " + moreCatsThanDogs);
		// Equality test operator
		System.out.printf("Same number of cats and weasels: %b\n", cats == weasels);
		System.out.printf("Same number of cats and dogs: %b\n", cats == dogs);
		
		System.out.printf("Number of cats greater than weasels: %b\n", cats > weasels);
		
		// don't use == with doubles as results can be unpredictable
		
	}

}
