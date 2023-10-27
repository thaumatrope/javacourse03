package application;

@FunctionalInterface
interface Runner {
	public void execute(String text);
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner run1 = (String text) -> {
			System.out.println("Hello! " + text);
		};

		run1.execute("John 1");

		System.out.println(run1 instanceof Runner);
		System.out.println(run1.getClass());

		// Parameter can be named arbitrarily
		Runner run2 = (t) -> {
			System.out.println("Hello! " + t);
		};

		run2.execute("John 2");

		// brackets can be omitted if there is only ONE parameter
		Runner run3 = t -> {
			System.out.println("Hello! " + t);
		};

		run3.execute("John 3");
		
		// curly brackets can be omitted if there is only ONE statement in lambda
		Runner run4 = t -> System.out.println("Hello! " + t);

		run4.execute("John 4");

	}

}
