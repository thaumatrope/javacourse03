package application;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Database db = null;

		try {
			db = new Database("localhost:3306");
			db.getData();
			db.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		db = null;

		try {
			db = new Database(null);
			db.getData();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally is here....");
			try{
				db.close();
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("This is NullPointerException....");
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
