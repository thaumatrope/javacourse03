package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Shopping item list
		
		
		String[] foods = {"Potatoes", "Rice", "Pasta", "Bread"};
		
		System.out.println(foods[0]);
		System.out.println(foods[1]);
		System.out.println(foods[3]);
		
		foods[1] = "Tomatoes";
		
		System.out.println(foods[0]);
		System.out.println(foods[1]);
		System.out.println(foods[3]);
		
		// foods.[4] = "Spinach";  out of bounds
		
		System.out.println(foods[0]);
		System.out.println(foods[1]);
		System.out.println(foods[3]);
		//System.out.println(foods[4]);
		
		

	}

}
