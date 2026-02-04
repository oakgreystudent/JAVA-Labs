package Lab2;

public class Person {
	
	// add constructor to call setters
	// scanner and input is added to main class
	// the only file that runs is the main file
	
	private String Name;
	private double Income;
	private String SSN;
	private double CreditScore;

	
	// setter for Name
	public void setName(String name) {
		this.Name = name; //read user input
	}
	
	// setter for Income
	public void setIncome(Double money) {
		this.Income = money; //read user input
	}
	
	// setter for SSN
	public void setSSN(String SSN) {
		this.SSN = SSN; //read user input
	}
	
	// setter for CreditScore
	public void setCreditScore(double creditScore) {
		this.CreditScore = creditScore; //read user input
	}
	
	// getter for Name
	public String getName() {
		return Name; // output name
	}
	
	// getter for Income
	public Double getIncome() {
		return Income; // output name
	}
	
	// getter for SSN
	public String getSSN() {
		return SSN; // output name
	}
	
	// getter for CreditScore
	public Double getCreditScore() {
		return CreditScore; // output name
	}
		
}

