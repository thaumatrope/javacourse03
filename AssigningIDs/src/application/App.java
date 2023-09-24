package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String CAT_FORMAT_STR = "Count of cats: %d\n";
		
		String catCount = String.format(CAT_FORMAT_STR, Cat.getCount());
		System.out.println(catCount);
		
		Cat cat1 = new Cat("Horace");
		Cat cat2 = new Cat("Mathilda");
		Cat cat3 = new Cat("Peter");
		
//		System.out.println(cat1 + " with ID " + cat1.getId());
//		System.out.println(cat2 + " with ID " + cat2.getId());
//		System.out.println(cat3 + " with ID " + cat3.getId());
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);	
		
		System.out.println(Cat.FOOD);
		
		System.out.println(cat2);
		
		System.out.println(Cat.getCount());
		
		catCount = String.format("Count of cats: %d\n", Cat.getCount());
		System.out.println(catCount);
	}

}
