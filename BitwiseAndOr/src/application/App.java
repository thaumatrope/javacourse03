package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value1 = 0b01010011;
		int value2 = 0b11010110;
		
		int result1 = value1 & value2;
		
		System.out.print(toBinary(value1));		
		System.out.printf(" - %3d\n", value1);
		System.out.print(toBinary(value2));
		System.out.printf(" - %3d\n", value2);				
		System.out.print(toBinary(result1));
		System.out.printf(" - %3d\n", result1);
		
		result1 = value1 | value2;
		System.out.println();
		
		System.out.print(toBinary(value1));		
		System.out.printf(" - %3d\n", value1);
		System.out.print(toBinary(value2));
		System.out.printf(" - %3d\n", value2);				
		System.out.print(toBinary(result1));
		System.out.printf(" - %3d\n", result1);
		
	}
	
	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}


}
