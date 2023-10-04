package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("App2");
		
		String pathString = "test.bin";
				
		try (var os = new ObjectInputStream(new FileInputStream(pathString))){
			Serializable[] people = (Serializable[]) os.readObject();
			
			System.out.println(people);
			System.out.println("Object deserialized - " + people);
			
			for(Serializable temp :people) {
				System.out.println("Object contains: - " + (Person)temp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Cannot open file: " + pathString);
		} catch (InvalidClassException e) {
			System.out.println("Incompatible class versions: " + pathString);
			System.err.println(e.getMessage());
			System.err.println(e.getClass());
		} catch (IOException e) {
			// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Cannot read file: " + pathString);

		} catch (ClassNotFoundException e) {
			System.out.println("Cannot read object from file: " + pathString);
		}

		
			
		}
}
		

