package application;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> texts = new LinkedList<>();
		
		texts.add("dog");
		texts.add("cat");
		texts.add("rat");
		
		for(var text:texts) {
			System.out.println(text);
		}
	}

}
