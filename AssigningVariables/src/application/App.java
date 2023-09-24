package application;

public class App {
	
	/* multiple line comment
	 * 
	 */
	
	public static void main(String[] args) {
		
		int dogs = 8;
		int cats = 3;
		
		System.out.println("Dogs: " + dogs);
		System.out.println("Cats: " + cats);
		
		dogs = cats;
			
		System.out.println("Dogs: " + dogs);
		System.out.println("Cats: " + cats);
		
		cats = 10;
		
		System.out.println("Dogs: " + dogs);
		System.out.println("Cats: " + cats);
		
	}

}
