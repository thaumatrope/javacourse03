package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		GetIntegers getInt = new GetIntegers();
		
		int temp1 = 0;
		int temp2 = 1;
		
		System.out.println("Time to square:");
		int[] tempSquare = getInt.newIntegers(1);
		temp1 = tempSquare[0];				

		temp2 = calc.square(temp1);
		
		System.out.printf("%d squared is: %d\n", temp1, temp2);
		
		
		System.out.println("Time to add:");
		int[] tempAdd = getInt.newIntegers(2);
		
		temp1 = tempAdd[0];				

		temp2 = tempAdd[1];
		
		System.out.printf("%d & %d added is: %d\n", temp1, temp2, calc.add(temp1, temp2));
		
		
		getInt.scannerClose();	
	}

}
