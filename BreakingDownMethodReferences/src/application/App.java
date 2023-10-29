package application;

@FunctionalInterface
interface Greeter{
	public void greet();
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Greeter g = () -> System.out.println("Hello");
		Greeter g = App::sayHello;
				
		g.greet();
	}
	
	private static void sayHello() {
		System.out.println("Hello there!");
	}

}
