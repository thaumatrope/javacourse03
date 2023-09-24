package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person person1 = new Person("Mary", 175.0, 100);
		Person person2 = new Person("Peter", 175.6, 10);
		Person person3 = new Person();
		
		
		System.out.println(person1.toString());
		System.out.println(person1); //implicit
	
		
		System.out.println(person2);
		System.out.println(person3);

	}

}
