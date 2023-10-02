package application;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//file location in file - Properties - Resource - Location
		String fileLocation = "C:\\eclipse\\udemy-java\\FileLocations\\Test.txt";
		
		
		// does file exist?
		System.out.println(new File(fileLocation).exists());
	}

}
