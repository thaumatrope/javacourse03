package application;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, List<String>> societies = new HashMap<>();
		
		societies.put(0, new LinkedList<String>(List.of("Dr.X", "PPChen", "Gates")));
		societies.put(1, new LinkedList<String>(List.of("ProfX", "Dr.Bill", "Ada Lovelace")));
		
		var people = societies.get(1);
		for(var person:people) {
			System.out.println(person);
		}
		
		for(var society:societies.entrySet()) {
			var id = society.getKey();
			var members = society.getValue();
			
			System.out.print(id +":\t");
			for(var person: members) {
				System.out.print(person);
				System.out.print("\t");
			}
			System.out.println();
		}
		

	}

}
