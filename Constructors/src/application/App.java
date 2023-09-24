package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.setName("Mary");
		person1.setAge(100);
		person1.setHeight(175);

		
		person2.setName("Peter");
		person2.setAge(10);
		person2.setHeight(75);
		
		System.out.println(person1.getName());
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
