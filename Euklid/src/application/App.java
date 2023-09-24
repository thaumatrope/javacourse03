package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GetIntegers myIntegers = new GetIntegers();
		
		int[] intArray = myIntegers.newIntegers(2);
		
		EuklidRecursion recursion = new EuklidRecursion();
		
		int biggestInt = recursion.gcd(intArray[0], intArray[1]);
		
		System.out.println("The biggest factor of " + intArray[0] + " and " + intArray[1] + " is >");
		System.out.println(biggestInt);
		
		
		
		



			

	


	}

}
