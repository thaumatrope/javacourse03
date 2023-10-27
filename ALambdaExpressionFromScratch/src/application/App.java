package application;

@FunctionalInterface
interface Runner{
	public void execute();
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runner run = () -> {
			System.out.println("Hello!");
		};
		
		run.execute();
		
		System.out.println(run instanceof Runner);
		System.out.println(run.getClass());

	}

}
