package application;

import depot1.Person;
import depot2.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Joe", "Montana", "Caribic", "Palace");
		
		System.out.println(person1.name);
		//System.out.println(person1.name2); private
		//System.out.println(person1.name3); protected
		
		System.out.println(person1);
		
		Employee emp1 = new Employee("Bert", "Simpson", "Aruba", "Moon");
		System.out.println(emp1.name);
		System.out.println(emp1);
		
		Person1 person11 = new Person1("Joe1", "Montana1", "Caribic1", "Palace1");
		System.out.println(person11.name);
		//System.out.println(person1.name2); private
		System.out.println(person11.name3); // access protected same package
		
		System.out.println(person11);
	}

}
