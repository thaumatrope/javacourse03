package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//file location in file - Properties - Resource - Location
		//String fileLocation = "C:\\eclipse\\udemy-java\\ReadingTextLineLineByLine\\Test2.txt";
		String fileLocation = "C:\\eclipse\\udemy-java\\ReadingTextLineLineByLine\\Test.txt";
		
		// does file exist?
		System.out.println(new File(fileLocation).exists());
	
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){  // try with resourses autnatically closes
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			System.err.println("File not found: " + fileLocation);  // output in red
			
		} catch (IOException e){
			System.err.println("Error reading this file: " + fileLocation);  // output in red
		}
		
	}

}
