package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue1 = 8;
		long longValue1 = intValue1;   //Widening Conversion
		
		System.out.println(longValue1);
		
		long longValue2 = 1234556;
		int intValue2 = (int)longValue2;   //Narrowing Conversion - needs cast
		System.out.println(intValue2);
		
		long longValue3 = 12345567891939237L;
		int intValue3 = (int)longValue3;   //Narrowing Conversion - needs cast
		
		System.out.println(intValue3); // value is too big
		
		int intValue4 = 24;   //Narrowing Conversion - needs cast
		byte byteValue4 = (byte)intValue4;
		
		System.out.println(byteValue4); // value is too big

	}

}
