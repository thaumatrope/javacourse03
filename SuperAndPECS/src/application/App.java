package application;

import collections.Array;
import hierarchy.Cat;
import hierarchy.Creature;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array<Mammal> mammals = new Array<>(6);
		mammals.add(new Mammal("dolphin"));
		mammals.add(new Mammal("sheep"));
		mammals.add(new Mammal("grizzly bear"));
		mammals.add(new Cat("Tweetie"));
		//mammals.add(new Creature("Whaley"));
		
		Array<Cat> cats = new Array<>(6);
		cats.add(new Cat("Silver"));
		cats.add(new Cat("Black"));
		cats.add(new Cat("Gray"));
		//cats.add(new Mammal("Birdy"));
		
		
		Array<Creature> creatures = new Array<>(7);
		creatures.add(new Creature("Dragon"));
		creatures.add(new Mammal("Donkey"));
		creatures.add(new Cat("Leisure"));

		feedAll(mammals);
		feedAll(cats);
		
		addMammal(mammals);
		addMammal(creatures);
		
		feedAll(mammals);
		//)feedAll(creatures);

	}
	
	private static void addMammal(Array<? super Mammal> mammals) {  //PECS Producer Extends Consumer Super
		mammals.add(new Mammal("Pete"));
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
