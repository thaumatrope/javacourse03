package collections;

import hierarchy.Mammal;

public class Util {
	
	public static void copy(Array<? extends Mammal> source, Array<? super Mammal> destination) {
		
		for(int i = 0; i < source.size(); i++) {
			destination.add(source.get(i));
		}
	}


}
