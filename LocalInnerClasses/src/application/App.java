package application;

public class App {

	private String name;
	
	public App() {
		name = "Elizabeth";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(this.name); no this-instance yet
		App app = new App();
		app.run();
		
		new App().run();
		
	}
	
	private void run() {		
		
		//local inner class
		class Printer {
			public void print() {
				System.out.println(App.this.name + " from within"); // refers to the outer class variable explicitly
			}
		}
		
		new Printer().print();
		
		
	}

}
