package Lab1;
import java.util.Scanner; // import scanner class

public class Problem1 {
	
	public static void main(String[] args) {
		String name = "Bob";
		
		double salestax = .06;
		int deliverycharge = 125;
		//String customername = "Sally";
		//int fridgeprice = 12;
		//int stoveprice = 12;
		String deliveryday = "3";
		
		
		Scanner user = new Scanner(System.in); //create scanner object
		System.out.println("Enter your name:");
		String customername = user.nextLine(); //read user input
		
		System.out.println("Enter fridge price:");
		int fridgeprice = user.nextInt(); //read user input
		
		System.out.println("Enter stove price:");
		int stoveprice = user.nextInt(); //read user input
		
		int total = fridgeprice + stoveprice;
		
		System.out.println("Hello " + customername);
		System.out.println("Your refrigerator ($" + fridgeprice + ") and stove ($" + stoveprice + ") will be delivered " + deliveryday + " days from now.");
		System.out.println("Your total cost will be: $" + total);
		

	}
	
}
