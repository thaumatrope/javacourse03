package application;

import java.util.concurrent.Executors;


// three references to ONE person object
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		
		test(p1);
		
		Person p2 = p1;
		
		test(p2);
		
		Person p3 = new Person();
		
		test(p3);
		
		//Executors.newSingleThreadExecutor(null);
	}
	
	static void test(Person person) {
		System.out.println(person);
	}

}
