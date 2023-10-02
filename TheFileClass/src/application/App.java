package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File currentDirectory1 = new File(".");  // current directory
		
		String myPath = "C:\\Users\\John Westfield\\git\\javacourse03\\TheFileClass"; // double backslash
		
		File currentDirectory2 = new File(myPath);
		
		System.out.println(currentDirectory1.getAbsolutePath());
		System.out.println(currentDirectory2.getAbsolutePath());
		try {
			System.out.println(currentDirectory1.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String file:currentDirectory1.list()){
			System.out.println(file);
		}
		
		
		// write file
		String text = "Hello\nthere";
		
		try {
			Files.write(Paths.get("text.txt"), text.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String file:currentDirectory1.list()){
			System.out.println(file);
		}
		// read file
		try {
			String retrievedText = Files.readString(Paths.get("text.txt"));
			System.out.println(retrievedText);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// delete file
		try {
			Files.deleteIfExists(Paths.get("text.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String file:currentDirectory1.list()){
			System.out.println(file);
		}
	}

}
