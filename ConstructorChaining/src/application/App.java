package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Claire");
		
		System.out.println(person1);
		
		Person person2 = new Person();
		
		System.out.println(person2);
		
		Person person3 = new Person(44);
		
		System.out.println(person3);
	}

}
