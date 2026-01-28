package Lab1;

/*
 * This class exercises functions and decision statements
 */

public class Problem3 {

	public static void main(String[] args){
		printSepticSize(3);
		purchaseMonth("May");
	}

	public static void printSepticSize(int bedrooms){
		switch(bedrooms) {
		case 1:
		case 2:
			System.out.println("Minimum size of septic tank for a 1-2 bedroom house is 750 gallons.");
			break;
		case 3:
			System.out.println("Minimum size of septic tank for a 3 bedroom house is 1000 gallons.");
			break;
		case 4:
			System.out.println("Minimum size of septic tank for a 4 bedroom house is 1200 gallons.");
			break;
		case 5:
			System.out.println("Minimum size of septic tank for a 5-6 bedroom house is 1500 gallons.");
			break;
		default:
			System.out.println("Incorrect number of bedrooms!");

		}
	}
	
	public static void purchaseMonth(String month){
		if (month == "March" | month == "April" | month == "May" | month == "June") {
			System.out.println("Great month to purchase a house!");
		}
		else if (month == "July" | month == "August" | month == "September" | month == "October") {
			System.out.println("Good month to purchase a house!");
		}
		else if (month == "November" | month == "February") {
			System.out.println("OK month to purchase a house!");
		}
		else if (month = "January" | month == "December") {
			System.out.println("Worst month to purchase a house!");
		}
		else System.out.println("Any month is a great month to purchase a house!");
	}


}
