package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] animals = {"Cat", "Dog", "Sloth", "Elephant"};
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println("This is animal " + (i+1) + " and its called " + animals[i] + " and it is " + animals[i].length() + " letters long");
			System.out.printf("%d. %s\n", i, animals[i]);
		}

	}

}
