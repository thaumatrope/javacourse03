package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("Mary", 175.0, 100);
		Person person2 = new Person("Peter", 175.6, 10);
		Person person3 = new Person();
		
		
		System.out.println(person1.toString());
		System.out.println(person1.getAge());
		System.out.println(person1.getHeight());
		
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.getHeight());
		
		System.out.println(person3.getName());
		System.out.println(person3.getAge());
		System.out.println(person3.getHeight());
	}

}
