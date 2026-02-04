package Lab2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person user2 = new Person();
	
		Scanner username = new Scanner(System.in); //create scanner object
		System.out.println("Enter your name:");
		String name = username.nextLine(); //read user input
	
		user2.setName(name);
		System.out.println(user2.getName());
		
		//username.close();
		
		Scanner Income= new Scanner(System.in); //create scanner object
		System.out.println("Enter your income:");
		double money = username.nextDouble(); //read user input
	
		user2.setIncome(money);
		System.out.println(user2.getIncome());
		
		//Income.close();
		
		Scanner SSN = new Scanner(System.in); //create scanner object
		System.out.println("Enter your SSN:");
		String ssn = SSN.next(); //read user input
	
		user2.setSSN(ssn);
		System.out.println(user2.getSSN());
		
		//SSN.close();
		
		Scanner CreditScoreInput= new Scanner(System.in); //create scanner object
		System.out.println("Enter your credit score:");
		double CreditScore = CreditScoreInput.nextDouble(); //read user input
	
		user2.setCreditScore(CreditScore);
		System.out.println(user2.getCreditScore());
		
		Scanner Choice = new Scanner(System.in); //create scanner object
		System.out.println("Do you want a home loan or car loan:");
		String answer = Choice.nextLine(); //read user input
	
		Loan Userloan = new Loan(); 
		if (answer.equalsIgnoreCase("Home loan")) {
			Userloan.HomeLoan(user2.getIncome(), user2.getCreditScore());
		
		}
		else if (answer.equalsIgnoreCase("Car loan")) {
			Userloan.CarLoan(user2.getIncome(), user2.getCreditScore());
		}
		SSN.close();
		Income.close();
		username.close();
		Choice.close();
		CreditScoreInput.close();
	}
}