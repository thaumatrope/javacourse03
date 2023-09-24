package application;

public class App {

	private int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new App().run();

	}

	public void run() {

		String name1;
		final String name2 = "Mary";

		class Test {
			public void print() {
				// name1 = "Peter";  not accessible
				//System.out.println(name1);
				System.out.println(name2);  // only final variable is accessible for inner class
				System.out.println(count);
				System.out.println(App.this.count); //explicit access to outer class variable
			}
		}

		new Test().print();
	}
}
