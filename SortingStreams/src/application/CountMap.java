package application;

import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("serial")
public class CountMap extends TreeMap<String, Integer> {

	public static void combine(CountMap map1, CountMap map2) {
		map2.forEach((word, count) -> {
			addOrPut(map1, word, count); 
		});
	}
	
	public static void combine(CountMap map,String word) {
		addOrPut(map, word, 1); 
	}
	
	public static void addOrPut(CountMap map, String word, Integer value) {
		if(map.get(word) == null) {
			map.put(word, value);
		}else {
			map.put(word, map.get(word) + value);
		}
	}

}
