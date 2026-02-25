package lab5;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

/**
* The Lab5Driver class tests the PropertyFinder class
*/


public class Lab5Driver {
	
	private String line;

	public static void FileWriter(boolean append)
	  throws FileNotFoundException {
	 
	    FileWriter fw = new FileWriter("errorlog.txt", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(this.line);
	    bw.newLine();
	    bw.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException{
	    // Create scanner to obtain input from the user
	    Scanner input = new Scanner(System.in);
		
		// Prompt user for name of property file 
	    System.out.print("Enter name of real estate file: ");
	    String fileName = input.nextLine();
		input.close();
		
		// try-catch block
		try {
			// Create a PropertyFinder and initialize with entries in the filepp
		    PropertyFinder finder = new PropertyFinder(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("Error:" + ex.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
			
			// try-catch block
			try {
				FileWriter(true);
				appendtoFile(finder);
			} catch (FileNotFoundException exc) {
				System.out.println("Error:" + exc.getMessage());
			}
		
		}

		input.close();
		
	}
}
