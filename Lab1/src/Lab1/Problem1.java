package Lab1;
import java.util.Scanner; // import scanner class

public class Problem1 {
	
	public static void main(String[] args) {
		
		double salestax = .06;
		double deliverycharge = 125;
		
		//The user is asked for the fridge price, stove price, and number of days until delivery.
		Scanner user = new Scanner(System.in); //create scanner object
		System.out.println("Enter your name:");
		String customername = user.nextLine(); //read user input
		
		System.out.println("Enter fridge price:");
		double fridgeprice = user.nextDouble(); //read user input
		
		System.out.println("Enter stove price:");
		double stoveprice = user.nextDouble(); //read user input
		
		System.out.println("Enter the number of days until delivery:");
		int deliverydays = user.nextInt(); //read user input
		//Calculates the total with the sales tax and delivery charge
		double total = (fridgeprice + stoveprice) + (fridgeprice + stoveprice) * salestax + deliverycharge;
		//Prints out the information to the user
		System.out.println("Hello " + customername);
		System.out.println("Your refrigerator ($" + fridgeprice + ") and stove ($" + stoveprice + ") will be delivered " + deliverydays + " day(s) from now.");
		System.out.println("Your total cost will be: $" + total);
		user.close();
		

	}
	
}