package application;

import collections.Array;
import collections.Pair;
import collections.Wrapper;
import hierarchy.Cat;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array<Mammal> mammals = new Array<>(4);
		mammals.add(new Mammal("dolphin"));
		mammals.add(new Mammal("sheep"));
		mammals.add(new Mammal("grizzly bear"));
		
		Array<Cat> cats = new Array<>(4);
		cats.add(new Cat("Silver"));
		cats.add(new Cat("Black"));
		cats.add(new Cat("Gray"));

		feedAll(mammals);
		feedAll(cats);

	}

	public static void feedAll(Array<? extends Mammal> mammals) {
		for (int i = 0; i < mammals.size(); i++) {
			if (mammals.get(i) != null) {
				//System.out.println(mammals.get(i) + " feeding.");
				mammals.get(i).feed();
			}
		}

	}

	private static <T> T find(Array<T> array, String text) {

		for (int i = 0; i < array.size(); i++) {
			T value = array.get(i);
			if (value.toString().equals(text)) {
				return value;
			}
		}
		return null;
	}

}
