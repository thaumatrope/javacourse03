package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 0b00010001;
		
		System.out.println(toBinary(value));
		
		
		int result1 = value << 5;
		
		System.out.println(toBinary(result1));
		
		int result2 = result1 >> 3;
		
		System.out.println(toBinary(result2));
		
		// left shift equals multiplication by 2
		System.out.print(toBinary(400 << 1));
		System.out.println(" : " + (400 << 1));
		
		// right shift equals division by 2
		System.out.print(toBinary(400 >> 1));
		System.out.println(" : " + (400 >> 1));

	}
	
	public static String toBinary(int value) {
		return String.format("%16s", Integer.toBinaryString(value)).replace(" ", "0");
	}


}
