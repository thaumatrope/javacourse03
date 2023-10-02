package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//file location in file - Properties - Resource - Location
		//String fileLocation = "C:\\eclipse\\udemy-java\\ReadingTextLineLineByLine\\Test2.txt";
		String fileLocation = "Test2.txt";
		
		// does file exist?
		System.out.println(new File(fileLocation).exists());
	
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation))){
			writer.write("Orange");
			writer.newLine();
			writer.write("Apple");
			writer.newLine();
			writer.write("Banana");
			writer.newLine();
			writer.write("Peach");
			writer.newLine();
			
		}catch(IOException e) {
			System.err.println("Error writing this file: " + fileLocation);  // output in red
		}
		
		System.out.println("File write completed: " + fileLocation);
		
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
