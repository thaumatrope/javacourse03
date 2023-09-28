package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// byte, short, integer, long
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 222200000;
		long longValue = 12423345345356L;
		
		// classes with Autoboxing (no constructor)
		Byte myByte = 8;
		Short myShort = 15;
		Integer myInterger = 23456;
		Long myLong = 283672837L;
		
		// deprecated constructors
		Integer newInt1 = new Integer(2345);
		Integer newInt2 = 2345;
		
		Integer newInt3 = new Integer(1);
		Integer newInt4 = 1;
		
		// compare only integer types, not floating point types!
		
		System.out.println(newInt1 == newInt2);
		System.out.println(newInt3 == newInt4);
		
		System.out.println(newInt1.equals(newInt2));
		System.out.println(newInt3.equals(newInt4));

	}

}
