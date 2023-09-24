package depot2;

import depot1.Person;

public class Employee extends Person {
	
	public Employee(String name1, String name2, String name3, String name4) {
		super(name1,name2,name3, name4);
		
		System.out.println("Employee constrcutor: name3 = " + this.name3);  //subclass can access protected
		//System.out.println("Employee constructor: name4 = " + this.name4); // no access modifier, not subclass
	}

}
