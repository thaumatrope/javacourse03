package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		People people = new People();
		
		var peopleList1 = people.get();
		
		
		
		peopleList1.forEach(System.out::println);
		
		//peopleList1.remove(1);
		
		peopleList1.forEach(System.out::println);
		
		var peopleList2 = people.get();
		peopleList2.forEach(System.out::println);
		
		
		
	}

}
