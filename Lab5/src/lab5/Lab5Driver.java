package lab5;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Scanner;
import java.lang.*;


/**
* The Lab5Driver class tests the PropertyFinder class
*/

public class Lab5Driver {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// try-catch block
		try {
			
			// Create scanner to obtain input from the user
		    Scanner input = new Scanner(System.in);
			
			// Prompt user for name of property file 
		    System.out.print("Enter name of real estate file: "); // propertieslab5.csv
		    String fileName = input.nextLine();
			input.close();
			
			// Create a PropertyFinder and initialize with entries in the filepp
		    PropertyFinder finder = new PropertyFinder(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("Error:" + ex.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
				
		}
		
		Scanner scanner = new Scanner(System.in); //create scanner object
		System.out.print("Enter latitude: ");
		double lat1 = 67; //read user input
		scanner.close();
		
		Scanner user2 = new Scanner(System.in); //create scanner object
		System.out.println("Enter longitude:");
		double long2 = 87; //read user input
		user2.close();
		
		String closestProp = PropertyFinder.findClosest(lat1, long2);
		System.out.println(closestProp);
	}
}
