package Lab1;
import java.util.Scanner; // import scanner class


public class Problem2 {
	public static void main(String[] args) {
		Scanner horse = new Scanner(System.in); //create scanner object
		System.out.println("Enter the horse height:");
		double height = horse.nextDouble(); //read user input
	
		//Calculates the height of the horse in hands by dividing its height by 4.
		double hands = height / 4;

		//Prints out the information to the user
		System.out.println("A horse " + height + " inches high is " + hands + " hands high.");
		horse.close();
		
	}

}