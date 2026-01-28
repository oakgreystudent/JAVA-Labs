package Lab1;
import java.util.Scanner; // import scanner class


public class Problem2 {
	public static void main(String[] args) {
		Scanner horse = new Scanner(System.in); //create scanner object
		System.out.println("Enter the horse height:");
		double height = horse.nextDouble(); //read user input
	
		double hands = height / 4;

		
		System.out.println("A horse " + height + " inches high is " + hands + " hands high.");

		
	}

}
