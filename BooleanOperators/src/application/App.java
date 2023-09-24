package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ==, !=, !, &&, ||
		
		boolean isRaining = true;
		boolean haveUmbrella = true;
		
		boolean takeUmbrella;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}else {
				takeUmbrella = false;
			}
		}else {
			takeUmbrella = false;
		}
		System.out.println(takeUmbrella);
		
		// better
		
		takeUmbrella = false;
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println(takeUmbrella);
		
		// better
		takeUmbrella = false;
		if (isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println(takeUmbrella);
		
		//shorter
		takeUmbrella = (isRaining && haveUmbrella) ? true:false;
		System.out.println(takeUmbrella);
		
		//shortest
		takeUmbrella = isRaining && haveUmbrella;
		System.out.println(takeUmbrella);
	}

}
