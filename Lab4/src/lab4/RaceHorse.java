package lab4;

public class RaceHorse extends Horse implements Comparable<Raceable>{
	private String registrationNum;
	private int yearfirstRaced;
	private int numRaces;
	private double winnings;
	
	// constructor
	public RaceHorse(String name, double height, double weight, int yearBorn, String color, String breed,
			String registrationNum, int yearfirstRaced, int numRaces, double winnings) {
		super(name, height, weight, yearBorn, color, breed);
		
		this.registrationNum = registrationNum;
		this.yearfirstRaced = yearfirstRaced;
		this.numRaces = numRaces;
		this.winnings = winnings;
	}

	// setter for registrationNum
	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum; //read user input
	}
	
	// setter for yearfirstRaced
	public void setYearfirstRaced(int yearfirstRaced) {
		this.yearfirstRaced = yearfirstRaced; //read user input
	}
	
	// setter for numRaces
	public void setNumRaces(int numRaces) {
		this.numRaces = numRaces; //read user input
	}
	
	// setter for winnings
	public void setWinnings(double winnings) {
		this.winnings = winnings; //read user input
	}
	
	// getter for registrationNum
	public String getRegistrationNum() {
		return registrationNum; // output 
	}
	
	// getter for yearfirstRaced
	public int getYearfirstRaced() {
		return yearfirstRaced; // output 
	}
	
	// getter for numRaces
	public int getNumRaces() {
		return numRaces; // output 
	}
	
	// getter for winnings
	public double getWinnings() {
		return winnings; // output
	}
	
	@Override
	public String toString() {
		return ("\n Race Horse Name: " + this.getName() + ", Height: " + this.getHeight() + ", Weight: " + this.getWeight() + ", Year born: " + this.getYearBorn() + ", Color: " + this.getColor() + ", Breed:" + this.getBreed() + "\n" + "======");
	}
	
	// compareTo method	only works on strings
	@Override
	public int compareTo(Raceable r) {
		return this.getName().compareTo(r.getName());
	}
	
	
	
}
