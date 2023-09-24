package Test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println(false ? "yes":"no"); // first operand must evaluate to a boolean
		
		int value = 77;
		
		value = value > 60 ? 60 : value;
		
		System.out.println(value);
		
		value = 55;
		value = value > 60 ? 60 : value;
		
		System.out.println(value);
		
		
		int[] values = {6, 3, 92, 63, 14};
		
		int min = Integer.MAX_VALUE; // max value storable in an int
		int max = Integer.MIN_VALUE;
		
		for(int currentValue:values) {
			min = currentValue < min ? currentValue: min;
			max = currentValue > max ? currentValue: max;
			
		}		
		
		System.out.println(min);		
		System.out.println(max);
		
		
	}

}
