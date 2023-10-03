package application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
	
	public static void main(String[] args){	
		
		String filename = "test.bin";
		File file = new File(filename);
		
		App app = new App();
		app.writeFile(file);
		app.readFile(file);
		
	}
		

		public void writeFile(File file) {		
			
			
			int value1 = 7;
			byte[] bytes = new byte[3];
			bytes[0] = 123;
			bytes[1] = -8;
			bytes[2] = 44;
			System.out.println("value is: " + value1);
			for(byte bit: bytes) {
				System.out.println("bytes is: " + bit);
			}
			
			try(var dos = new DataOutputStream(new FileOutputStream(file))){
				dos.writeInt(value1);
				dos.write(bytes);
				System.out.println("Written: " + file.getAbsolutePath());
				System.out.println("Written in bytes: " + file.length());
			} catch (FileNotFoundException e) {
				System.out.println("Cannot create: " + file.getName());
				//e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Cannot write: " + file.getName());
				//e.printStackTrace();
			}
			
		}
		
	public void readFile(File file)	{
		
		try(var dos = new DataInputStream(new FileInputStream(file))){
			int value2 = dos.readInt();
			byte[] bytes2 = dos.readNBytes(3);
			
			
			System.out.println("value2 is: " + value2);			
			for(byte bit: bytes2) {				
				System.out.println("bytes2 is: " + bit);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create: " + file.getName());
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot write: " + file.getName());
			//e.printStackTrace();
		}
		
	}

}
