package Lab1;
import java.util.Scanner; // import scanner class

public class Problem4 {
	public static void main(String[] args){
		
		//Scanner user = new Scanner(System.in); //create scanner object
		Scanner user = new Scanner(System.in); //create scanner object

		Boolean more = true;

		
		while (more) {
			System.out.println("program open");
			System.out.println("Enter item price:");
			//user.nextInt();
			int price = user.nextInt(); //read user input
			
			isTaxable(price);
			
			System.out.println("Enter yes to enter another item:");
			user.nextLine();
			String more2 = user.nextLine(); //read user input
			if (more2.equalsIgnoreCase("yes")) {
				more = true;
			}
			else {
				more = false;	
			}
		}
		System.out.println("program close");

		user.close();
	}
	
	public static void isTaxable(int price) {
		
		if (price > 50) {
			System.out.println("Item with price " + price + " is taxable.");
		}
		else	 System.out.println("Item with price " + price + " is not taxable.");

	}

}
