package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] objs = {new Person(), new Computer()};
		Describeable[] desc = {new Person(), new Computer()};

		
		for(Object obj:objs) {
			//can't access getDescription()
		}
		for(Describeable des:desc) {
			System.out.println(des.getDescription());
		}
		
		
	}
}
