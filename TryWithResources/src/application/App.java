package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try with resources ONLY with classes that implement AutoCloseable
		try (Database db = new Database("abcd")) {
			
			db.getData();
		

		} catch (Exception e) {
			System.out.println("Catching Exception...");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
	
// run with null - doesn't open, run with less than 3 - can't get data, run with more than 5 - cannot close