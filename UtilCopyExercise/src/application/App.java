package application;

import collections.Array;
import collections.Util;
import hierarchy.Cat;
import hierarchy.Creature;
import hierarchy.Mammal;

public class App {
	
	static {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array<Cat> mammals1 = new Array<>(4);
		mammals1.add(new Cat("dolphin"));
		mammals1.add(new Cat("sheep"));
		mammals1.add(new Cat("grizzly bear"));
		mammals1.add(new Cat("Tweetie"));
		//mammals.add(new Creature("Whaley"));
		
		Array<Creature> mammals2 = new Array<>(8);
		mammals2.add(new Creature("elephant"));
		mammals2.add(new Creature("giraffe"));


		Util.copy(mammals1, mammals2);
		
		Array<Cat> cats = new Array<>(6);
		cats.add(new Cat("Silver"));
		cats.add(new Cat("Black"));
		cats.add(new Cat("Gray"));
		//cats.add(new Mammal("Birdy"));
		
		
		Array<Creature> creatures = new Array<>(7);
		creatures.add(new Creature("Dragon"));
		creatures.add(new Mammal("Donkey"));
		creatures.add(new Cat("Leisure"));

		feedAll(mammals1);
		feedAll(cats);
		
		addMammal(mammals2);
		addMammal(creatures);
		
		feedAll(mammals1);
		//feedAll(mammals2);
		//)feedAll(creatures);
		
		for (int i = 0; i < mammals2.size(); i++) {
			if (mammals2.get(i) != null) {
				System.out.println(mammals2.get(i) + " feeding.");

			}
		}

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
