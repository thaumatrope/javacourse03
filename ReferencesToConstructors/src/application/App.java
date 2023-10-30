package application;

@SuppressWarnings("rawtypes")
class Person implements Comparable{

	private String name;

	public Person(String name) {
		this.name = name;
	}
	public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}


	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}


interface PersonCreator{
	Person create();
}
interface PersonNameCreator{
	Person create(String name);
}

public class App {

	public static void main(String[] args) {
		
		PersonCreator pc1 = ()->new Person();
		
		Person p1 = pc1.create();
		System.out.println(p1);
		PersonNameCreator pnc1 = (s)-> new Person(s);
		
		Person p2 = pnc1.create("Lisa");
		System.out.println(p2);
		
		PersonCreator pc2 = Person::new;
		
		Person p3 = pc2.create();
		System.out.println(p3);
		PersonNameCreator pnc2 = Person::new;  // Java chooses the right constructor via Interface
		
		Person p4 = pnc2.create("Michelle");
		System.out.println(p4);

		
	
	}

}
