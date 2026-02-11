package Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab3Driver {

	public static void printProperties(String fileName, String propertyType)
	        throws FileNotFoundException {

	    File file = new File(fileName);
	    Scanner input = new Scanner(file);

	    input.nextLine(); 

	    while (input.hasNextLine()) {
	        String line = input.nextLine();
	        String[] parts = line.split(",");

	        String type = parts[1].replace("\"", ""); 

	        if (type.equalsIgnoreCase(propertyType)) {
	            System.out.println(line);
	        }
	    }

	    input.close();
	}

    public static void printPropertiesPrice(String fileName, double maxPrice)
            throws FileNotFoundException {

        File file = new File(fileName);
        Scanner input = new Scanner(file);

        input.nextLine();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] parts = line.split(",");

            if (parts[6].isEmpty()) continue;

            double price = Double.parseDouble(parts[6]);

            if (price <= maxPrice) {
                System.out.println(line);
            }
        }

        input.close();
    }
 
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of CSV file: ");
        String fileName = sc.nextLine();

        System.out.print("Enter property type: ");
        String type = sc.nextLine();

        printProperties(fileName, type);

        System.out.print("\nEnter max price: ");
        double max = sc.nextDouble();

        printPropertiesPrice(fileName, max);

        sc.close();
    }

}
