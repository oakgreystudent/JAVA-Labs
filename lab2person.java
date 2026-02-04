package Lab2;
import java.util.Scanner; // import scanner class

public class Person {
	
	// add constructor to call setters
	// scanner and input is added to main class
	// the only file that runs is the main file
	
	private String Name;
	private Double Income;
	private String SSN;
	private String CreditScore;

	
	// setter for Name
	public static String setName() {
		String Name = user.next(); //read user input
	}
	
	// setter for Income
	public static Double setIncome(Double[] args) {
		Double Income = user.nextDouble(); //read user input
	}
	
	// setter for SSN
	public static void setSSN(String[] args) {
		String SSN = user.next(); //read user input
	}
	
	// setter for CreditScore
	public static void setCreditScore(Double[] args) {
		Double CreditScore = user.nextDouble(); //read user input
	}
	
	// getter for Name
	public static String getName(String[] args) {
		return Name; // output name
	}
	
	// getter for Income
	public static Double getIncome(Double[] args) {
		return Income; // output name
	}
	
	// getter for SSN
	public static String getSSN(String[] args) {
		return SSN; // output name
	}
	
	// getter for CreditScore
	public static Double getCreditScore(Double[] args) {
		return CreditScore; // output name
	}
		
	}

}
