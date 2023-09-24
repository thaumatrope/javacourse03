package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal();
		System.out.println(a1);
		
		Cat c1 = new Cat();
		System.out.println(c1);
		
		// Upcasting of a2
		Animal a2 = c1;  //a2 refers to c1
		Animal a3 = (Animal)c1; //explicit Upcasting - ins't necessary due subtype polymorphism
		
		System.out.println(a2 == c1); // is true
		System.out.println(a3 == c1); // is true
		
		System.out.println(a2);
		System.out.println(a3);

	}

}
