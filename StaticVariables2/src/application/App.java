package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat("Horace");
		Cat cat2 = new Cat("Mathilda");
		Cat cat3 = new Cat("Peter");
		
		System.out.println(cat1 + " with ID " + cat1.getId());
		System.out.println(cat2 + " with ID " + cat2.getId());
		System.out.println(cat3 + " with ID " + cat3.getId());
		
		
		System.out.println(Cat.FOOD);
		
		System.out.println(cat2);
		
		System.out.println(Cat.getCount());
	}

}
