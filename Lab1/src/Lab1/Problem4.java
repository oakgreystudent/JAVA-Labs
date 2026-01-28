package Lab1;
import java.util.Scanner; // import scanner class

public class Problem4 {
	public static void main(String[] args){
		
		Scanner user = new Scanner(System.in); //create scanner object
		Boolean more = true;

		
		//While loop continues until the more variable is set to false
		while (more) {
			System.out.println("Enter item price:");
			double price = user.nextDouble(); //read user input
			//Call to the function
			isTaxable(price);
			
			System.out.println("Continue? (yes/no):");
			user.nextLine();
			String response = user.next(); //read user input
			//Checks value of response and assigns the value of more to true or false accordingly
			if (response.equalsIgnoreCase("yes")) {
				more = true;
			}
			else {
				more = false;	
			}
		}

		user.close();
	}
	
	public static void isTaxable(double price) {
		
		//Checks if the price is below 50 or above 50, printing a message out for each scenario.
		if (price > 50) {
			System.out.println("Item with price " + price + " is taxable.");
		}
		else	 System.out.println("Item with price " + price + " is not taxable.");

	}

}