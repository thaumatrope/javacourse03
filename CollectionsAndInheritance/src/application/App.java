package application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SkillSet extends HashSet<String>{
	
	public boolean isComplete() {
		
		return this.contains("programming") && this.contains("teaching");
	}
	
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map<Integer, Set<String>> map = new HashMap<>();
		Map<Integer, SkillSet> map = new HashMap<>();
		
		SkillSet skill1 = new SkillSet();
		
		skill1.add("programming");
		skill1.add("engieering");
//		skill1.add("engieering");
		
		map.put(0, skill1);
		
		System.out.println(skill1.isComplete());
		System.out.println();
		for(var entry:map.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}

}
