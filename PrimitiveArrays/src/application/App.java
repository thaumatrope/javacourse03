package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers1 = {2, 4, 6, 8}; // declaration and initialization
		
		int[] numbers2 = {};
		
		int[] numbers3 = new int[3]; //declaration and initialization with 0
		
		numbers3[0] = 1;
		numbers3[1] = 123;
		numbers3[2] = 5;
		
		System.out.println(numbers1.length);
		System.out.println(numbers2.length);
		System.out.println(numbers3.length);
		
		for(int i = 0; i<3;i++) {
			
			System.out.println(numbers3[i]);
		}

	}

}
