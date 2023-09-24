package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isRaining = true;
		boolean mightRaining = false;
		
		boolean takeUmbrella = false;
		
		if (isRaining || mightRaining) {
			takeUmbrella = true;
		}
		
		System.out.println(takeUmbrella);
		
		takeUmbrella = (isRaining || mightRaining) ? true:false;
		System.out.println(takeUmbrella);
		
		//shortest
		takeUmbrella = isRaining || mightRaining;
		
	}

}
