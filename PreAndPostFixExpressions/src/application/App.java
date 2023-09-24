package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int otters = 5;
		int giraffes = 10;
		int elephants = 3;
		
		int animals = ++otters;
		
		System.out.printf("Otters: %d\n", otters);
		System.out.printf("Giraffes: %d\n", giraffes );
		System.out.printf("Elephants: %d\n", elephants);
		System.out.printf("Animals: %d\n", animals);
		
		animals = otters + otters++; // expression is 12
		animals = otters++ + otters; // expression is 13
		animals = --elephants + ++otters + giraffes++ + elephants; // horrible code!
		
		System.out.printf("Otters: %d\n", otters);
		System.out.printf("Giraffes: %d\n", giraffes );
		System.out.printf("Elephants: %d\n", elephants);
		System.out.printf("Animals: %d\n", animals);
	

	}

}
