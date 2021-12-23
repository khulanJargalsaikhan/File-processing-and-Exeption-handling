package learningFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		
		File file = new File("myfilef.txt");
		
		// Using file reader instead of scanner
		// After Java 1.7 there is a better way to handle NullPointerException that is called TRY WITH RESOURCES with Auto Closable
		try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader); ){
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			//e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("There is a problem reading the file" + file.getName());
		}
		
		
		
		
		
	}
}
