package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	
	List<String> text = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		
		try {
			//@Formatter:off
			var list = Files.
			lines(Paths.get("Great Expectations.txt")).
//			map(App::splitText).
//			map(l->Arrays.asList(l.split("[^a-zA-Z]+"))).
			map(l->l.split("[^a-zA-Z]+")).
			map(Arrays::asList).
			flatMap(s->s.stream()).
			collect(Collectors.toList());
			
			int i = 0;
			for(var word: list) {
				System.out.print(word);
				System.out.print(" ");
				if(i++%20 == 0) {
					System.out.println();
				}
			}
			
			//@Formatter:on
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			Files.lines(Paths.get("Great Expectations.txt")).close();
		}
		

		

	}
	
//	public static List<String> splitText(String line) {
//		
//		return Arrays.asList(line.split("[^a-zA-Z]+"));
//		
//	}

}
