package application;

public class App {

	public static void main(String[] args) {

		
		int value1 = 0b01010011;
		int value2 = 0b11010110;
		
		int result1 = value1 ^ value2;
		
		System.out.print(toBinary(value1));		
		System.out.printf(" - %3d\n", value1);
		System.out.print(toBinary(value2));
		System.out.printf(" - %3d\n", value2);				
		System.out.print(toBinary(result1));
		System.out.printf(" - %3d\n", result1);
		
		int value3 = 127;
		int result2 = ~value3;
		System.out.println();
		
		System.out.print(toBinary(value1));		
		System.out.printf(" - %3d\n", value1);
		System.out.print(toBinary(result2&0x000000FF));
		System.out.printf(" - %3d\n", result2);
		
	}
	
	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}

}
