package application;

public class Menu {
	
	String[] menuText = {"View database", "Add new item", "Delete item", "Quit program"};
	
	public void display() {
		
		int itemNumber = 0;
		
		System.out.println("Choose an option >");
		
		for(String item: menuText){
			System.out.println(++itemNumber + ". " + item);
		}
		
	}

}
