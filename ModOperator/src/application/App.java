package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value1 = 123;
		int value2 = 10;
		
		System.out.println(value1/value2);
		System.out.println((float)value1/value2); //casting one to floating type
		
		System.out.println(value1%value2);  // remainder is modulo
		
		for (int i = 0; i < 1_000; i++){
			
			if(i%100 == 0) {
				System.out.println("Processed " + i + " lines.");
			}
		}

		
	}

}
