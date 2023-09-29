package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//equals
		Integer intValue1 = 128;  
		Integer intValue2 = 128;  
		
		System.out.println((intValue1.equals(intValue2) + " / equals")); 
		System.out.println(((intValue1 == intValue2) + " / ==")); 
				
		//setting null
		Double dValue = null;
		System.out.println(dValue);
		
		String intString = "dlj73";
		try{
			
			Integer intValue3 = Integer.parseInt(intString);
			System.out.println(intValue3);
		}catch (NumberFormatException e) {
			System.out.println("Cannot convert to int: " + intString);
		}
		
		Integer intValue4 = 777;  
		System.out.println("128 in HEX is: " + Integer.toHexString(intValue4));
		System.out.println("128 in BIN is: " + Integer.toBinaryString(intValue4));
		System.out.printf("128 in BIN is: " + String.format("%16s", Integer.toBinaryString(intValue4)).replace(' ', '0'));
		
		
	}

}
