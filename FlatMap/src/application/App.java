package application;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Set<Integer>> list = List.of(
			Set.of(1,2,3),
			Set.of(4,5,6),
			Set.of(7,8,9)
		);
		
		
		
		list.stream().forEach(System.out::println);
		System.out.println();
		
		list.stream().
//		peek(l -> System.out.println(l + " >> " + l.getClass())).
		map(TreeSet::new).
//		peek(l -> System.out.println(l + " >>>> " + l.getClass())).
		flatMap(s->s.stream()).			// flatens the data structure
		forEach(System.out::println);

			
	}

}
