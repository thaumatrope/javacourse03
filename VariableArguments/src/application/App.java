package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App().run(66, "Hello", ",", "how", "are", "you");
		
	}
	
	// variable arguments must be the LAST parameter
	public void run(int value, String... texts) {
		System.out.println(value);
		for(var text:texts) {
			System.out.print(text+ " ");
		}
	}

}
