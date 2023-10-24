package application;

import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var list = List.of("one", "two", "three");
		
		list.forEach(new Consumer<String>(){

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.print(t + " ");
				
			}
			
		});
		System.out.println();
		System.out.println();
		
		
		list.forEach(System.out::println);
		System.out.println();
		
		
		list.forEach(t->{
			System.out.print(t + " ");
		});
	}

}
