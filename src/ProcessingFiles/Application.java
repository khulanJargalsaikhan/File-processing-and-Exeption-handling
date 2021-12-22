package ProcessingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// Input from keyboard
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String enteredText = input.nextLine();
		System.out.println(enteredText);
		
		
		
		// Input from a File
		// Exception(error) handling
		
		try {
			File file = new File("myfile.txt");
			Scanner inputFile;
			inputFile = new Scanner(file);
			while(inputFile.hasNext()) {
				String line = inputFile.nextLine();
				System.out.println(line);
			} 
			inputFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			//e.printStackTrace();
		}
		
		
		
		
		
	}

}
