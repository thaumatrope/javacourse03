package Test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello Test!");
		
//		int[] values = {2,4,6,8};
		
//		Random random = new Random();
//		
//		System.out.println("Up to this number: " + values.length);
//		System.out.println(random.nextInt(values.length));
//		
//		for(int i = 0; i < 100; i++) {
//			int randomValue = random.nextInt(values.length);
//			System.out.print(values[randomValue] + " ");
//		}
		
		
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println(c1);
		System.out.println(c1 == c2);
		
		char c3 = '\u0000'; // default value for char
		System.out.println("'" + c3 + "'");
	
		char c4 = '\u261f'; 
		System.out.println("'" + c4 + "'");
		
		char c5 = '\u00A9'; 
		System.out.println("'" + c5 + "'");
		
		char c6 = 65; 
		System.out.println("'" + c6 + "'");
		
		String text = "orange";
		char c7 = text.charAt(4);
		System.out.println("'" + c7 + "'");
	}

}
