package application;

public class App {
	
	private String name = "Jojo";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App().start();
	}
	
	public void start() {
		//System.out.println(name);
		InnerClass ic = new InnerClass();
		this.activate(ic);
		
		
		// Anonymous class
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println(name + " is anonymous!");
			}
		};
		this.activate(runner);
		
		// shorter anonyymous class
		this.activate(new Runnable() {
			public void run() {
				System.out.println(name + " is anonymous and shorter!");
			}
		});
	}
	
	public void activate(Runnable runner) {
		runner.run();
	}
	
	public class InnerClass implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			System.out.println(name);
		}
		
		
	}

}
