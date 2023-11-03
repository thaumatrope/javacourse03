package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hexadecimal 	0 - F
		// Decimal 		1 - 9
		// Binary		0 - 1
		
		// Output: integer >> binary
		int value = 123;
		System.out.println(Integer.toBinaryString(value));
		
		// Output: integer >> binary

		System.out.println(Integer.toHexString(value));
		
		int value255 = 0xFF;
		System.out.println(Integer.toBinaryString(value255));
		System.out.println(value255);
	}

}
