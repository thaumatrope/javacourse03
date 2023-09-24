package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isRaining = true;
		boolean mightRaining = false;
		
		boolean haveUmbrella = false;
		
		
		
	
		if((isRaining || mightRaining) && haveUmbrella) {
			System.out.println("Take umbrella");
		}else {		
			System.out.println("Don't take umbrella");
		}

		

	}

}
