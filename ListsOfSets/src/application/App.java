package application;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Set<String>> exerciseRota = new ArrayList<>();
		
		exerciseRota.add(new LinkedHashSet<String>(Set.of("pushups", "pullups", "leg raises")));
		exerciseRota.add(new LinkedHashSet<String>(Set.of("walking", "star jumps", "cycling")));
		for(var day:exerciseRota) {
			for(var excercide: day) {
				System.out.print(excercide);
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
		Set<String> exercises = exerciseRota.get(0);
		for(var exercise:exercises) {
			System.out.println(exercise);
		}
		
		
	}

}
