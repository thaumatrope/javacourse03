package application;

public class Menu {

	String[] menuText = { "View database", "Add new item", "Delete item", "Quit program" };
	String output = new String();

	public String display() {

		int itemNumber = 1;

		//System.out.println("Choose an option >");
		output += "Choose an option >\n";

		for (String item : menuText) {
			//output += " " + (itemNumber++) + ". " + item + "\n";
			output += String.format(" %d. %s\n", itemNumber++, item);
		}
		return output;

	}

}
