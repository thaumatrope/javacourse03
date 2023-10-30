package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Files.lines(Paths.get("Great Expectations.txt")).forEach(System.out::println);
		

	}

}
