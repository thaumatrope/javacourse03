package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//file location in file - Properties - Resource - Location
		//String fileLocation = "C:\\eclipse\\udemy-java\\ReadingTextLineLineByLine\\Test2.txt";
		String fileLocation = "C:\\eclipse\\udemy-java\\FileReadingExercise\\reactiontimes.csv";
		
		// does file exist?
		System.out.println(new File(fileLocation).exists());
	
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){  // try with recourses automatically closes
			
			int sum = 0;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int avg = 0;
			int attempts = 0;
			int value = 0;
			String line = null;
			while((line = reader.readLine()) != null) {
								
				System.out.println(line);
				String[] result = line.split(",");
				
				if(result.length < 3) {
					System.out.println("Line does not contain a number!");
					continue;
				}
				attempts += 1;
				try{
					value = Integer.parseInt(result[2]);
				}catch (NumberFormatException e) {
					
					System.out.println("Line does not contain a number! -->" + result[2]);
					continue;
				}
				max = (value > max)? value : max;
				min = (value <= min)? value : min;
				sum += value;
			}
			
			System.out.println("Your average reaction time is: " + (double)sum / attempts + " ms");
			System.out.println("Your max reaction time is: " + max + " ms");
			System.out.println("Your min reaction time is: " + min + " ms");
			System.out.println("Your complete reaction time is: " + sum + " ms");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			System.err.println("File not found: " + fileLocation);  // output in red
			
		} catch (IOException e){
			System.err.println("Error reading this file: " + fileLocation);  // output in red
		}
		
	}
}

