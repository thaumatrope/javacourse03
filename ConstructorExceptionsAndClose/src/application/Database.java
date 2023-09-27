package application;

public class Database implements AutoCloseable {

	private String connectionString;
	
	
	public Database(String connectionString) throws Exception {
		System.out.println("Opening connection to..." + connectionString);
		if(connectionString == null) {
			throw new Exception("Cannot connect to db " + connectionString);
		}
		this.connectionString = connectionString;
		System.out.println("Connected to " + connectionString);
	}
	
	public void getData() throws Exception {
		System.out.println("Getting data from..." + connectionString);
		
		if(connectionString.length() < 3) {
			throw new Exception("Cannot get data from db " + connectionString);
		}
		
	}
	
	

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing connection to..." + connectionString);		
		
		System.out.println("Disconnected from db");
	}
	
	
//	public void close() {
//		System.out.println("Closing connection...");
//	}
}
