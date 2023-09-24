package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		
		while(counter <= 10) {
			System.out.printf("Counter %d\n", counter);
			counter = counter +1;
			if (counter == 9) {
				System.out.println("Gotcha!");
				break;
			}
		}

	}

}
