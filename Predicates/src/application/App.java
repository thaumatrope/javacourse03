package application;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p1 = new Predicate<>() {

			@Override
			public boolean test(String t) {
				return t.length() < 4;
			}}
		;
		
		System.out.println(p1.test("Me"));
		System.out.println(p1.test("Me&You"));
		
		Predicate<String> p2 = s -> s.length() < 4;
		
		System.out.println(p1.test("MeAndYou"));
		System.out.println(p1.test("You"));
		
	}

}
