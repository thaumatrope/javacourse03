package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameObject[] objs = {new Player(), new Monster()};
		
		for(var obj: objs) {
			System.out.println(obj);
			obj.describe();
		}
	}
	
	
}
