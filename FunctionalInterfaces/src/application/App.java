package application;

import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var list = List.of("one", "two", "three");
		
		list.forEach(s->{
			System.out.print(s + " ");
		});
	}

}
