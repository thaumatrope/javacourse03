package application;

public class App {
	
	private int value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new App().runApp();
		
	}
	
	
	public void runApp() {
		
		int valueLocal = 0;
		
		Runnable r = () -> {
			System.out.println(this);
			System.out.println(this.value++);
			//System.out.println(valueLocal++);
			System.out.println(valueLocal);
		};
		
		r.run();
		r.run();
		
	}

}
