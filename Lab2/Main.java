package Lab2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person user2 = new Person();

		// take user's name as input
		Scanner username = new Scanner(System.in); //create scanner object
		System.out.println("Enter your name:");
		String name = username.nextLine(); //read user input
	
		user2.setName(name);
		System.out.println(user2.getName()); // print user's name
		
		//username.close();

		// take user's income as input
		Scanner Income= new Scanner(System.in); //create scanner object
		System.out.println("Enter your income:");
		double money = username.nextDouble(); //read user input
	
		user2.setIncome(money);
		System.out.println(user2.getIncome()); // print user's income
		
		//Income.close();

		// take user's SSN as input
		Scanner SSN = new Scanner(System.in); //create scanner object
		System.out.println("Enter your SSN:");
		String ssn = SSN.next(); //read user input
	
		user2.setSSN(ssn);
		System.out.println(user2.getSSN()); // print SSN
		
		//SSN.close();

		// take user's credit score as input
		Scanner CreditScoreInput= new Scanner(System.in); //create scanner object
		System.out.println("Enter your credit score:");
		double CreditScore = CreditScoreInput.nextDouble(); //read user input
	
		user2.setCreditScore(CreditScore);
		System.out.println(user2.getCreditScore()); // print credit score

		// ask for user's choice or home or car loan
		Scanner Choice = new Scanner(System.in); //create scanner object
		System.out.println("Do you want a home loan or car loan:");
		String answer = Choice.nextLine(); //read user input

		// check user input to see if it meets parameter
		Loan Userloan = new Loan(); 
		if (answer.equalsIgnoreCase("Home loan")) {
			Userloan.HomeLoan(user2.getIncome(), user2.getCreditScore()); // pass income and credit score to function
		
		}
		else if (answer.equalsIgnoreCase("Car loan")) {
			Userloan.CarLoan(user2.getIncome(), user2.getCreditScore()); // pass income and credit score to function
		}
		SSN.close();
		Income.close();
		username.close();
		Choice.close();
		CreditScoreInput.close();
	}

}
