package application;

public class App {

	// Program jumps out where Exception occurred, if no try...catch exists
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		try {
			p1.setName(null);
			System.out.println("Still in try-Block");  // does not get executed
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			// catch Exception again
			throw e;  // will throw out of method
		} finally { // final block which always will be executed
			System.out.println("Finally Block");
		}
		
		
		System.out.println("Program completed");
	}

}
