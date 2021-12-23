package learningFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		
		File file = new File("myfilef.txt");
		
		//reads entire file
		FileReader fileReader = null;
		//reads file line by line
		BufferedReader bufferedReader = null;
		
		
		// Using file reader instead of scanner
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
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
		} finally {   // this block will always run
			// this is the area that all resources should be closed that prevents from memory leak
			try {
				// instead of catching NullPointerException, this is a better way that is used before Java 1.7. 
				// After java 1.7 there is also a better way that is called TRY WITH RESOURCES
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if(fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println("Unable to close file " + file.getName());
				//e.printStackTrace();
			} 
		}
		
		
		
		
		
		
	}
}
