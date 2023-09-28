package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long longValue1 = 1334;  // automatic conversion
		long longValue2 = 133423423424L;  // too long for int value, need l or L at the end
		
		System.out.println(longValue1); 
				
		float floatValue1 = 7.34F;
		System.out.println(floatValue1); 
		
		byte byteValue1 = 127; // byte is a signed value
		byte byteValue2 = (byte)255;
		System.out.println(byteValue2); 
		System.out.println(byteValue2 & 0xFF); // show as unsigned byte
		
		int intValue1 = 1000000;
		int intValue2 = 1_000000; // more readable -- 1 Million  _ can be used
		
		//scientific notation
		double doubleValue1 = 1E6;
		float floatValue2 = 1E5F;
		System.out.println(doubleValue1); 
		System.out.println(floatValue2);
	}

}
