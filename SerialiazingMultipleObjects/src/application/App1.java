package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class App1 {

	public static void main (String[] args) {
		System.out.println("App1");
		
		Person p1 = new Person("Annie", 007);
		
		String pathString = "test.bin";
		
		Serializable[] people = new Serializable[2];
		people[0] = new Person("John", 11);
		people[1] = new Person("Sweetie", 22);
		
		
		try (var os = new ObjectOutputStream(new FileOutputStream(pathString))){
			os.writeObject(people);
			System.out.println(people);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot create file: " + pathString);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot write file: " + pathString);
		}
		
		System.out.println("Object serialized - " + people);
		
	}
	
	
}
