package application;

public class App {

	@SuppressWarnings(value = { "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// float, double
		
		float floatValue = 23.77f;  // f indicates float
		double doubleValue = 23456.63422;
		
		System.out.printf("float contains >> %d bytes; min: %f, max: %f\n", Float.SIZE/8, Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.println();
		System.out.printf("double contains >> %d bytes; min: %f, max: %f\n", Double.SIZE/8, Double.MIN_VALUE, Double.MAX_VALUE);
		
		
		// Precision float vs double
		float f = 1.23456789123456789f; // app. 7 significant digits
		System.out.printf("float >> %.20f\n", f);

		double d = 1.23456789123456789;  // app. 15 significant digits
		System.out.printf("double >> %.20f\n", d);


	}

}
