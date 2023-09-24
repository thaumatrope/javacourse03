package application;

public class EuklidRecursion {
	
	int gcd (int a, int b) {
		
		System.out.println("a is " + a + " / b is " + b);
		
		
		if (a == 0) {
			return b;
		}else {
			System.out.println("-> gcd("+ b%a + ", " + a + ")");
			return this.gcd(b%a, a);
		}
	}

}
