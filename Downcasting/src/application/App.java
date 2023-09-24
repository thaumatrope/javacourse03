package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Cat(); //Upcasting
		System.out.println(a1);
		
		Cat c1 = (Cat)a1; // doesn't work by default - Downcasting
		System.out.println(c1);
		// a1.jump();  doesn't work
		c1.jump();
		
		
		
		Animal a2 = new Animal(); //Upcasting
		System.out.println(a2);
		
		Cat c2 = (Cat)a2; // doesn't work by default - Downcasting - Object is still an Animal!
		System.out.println(c2);
		//c2.jump(); doesn't work
		


	}

}
