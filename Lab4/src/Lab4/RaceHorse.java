/*
Jonathan Sliwa and Folu Amao
CS 210
2/18/2026
Lab 4 */

package Lab4;

//Extension of horses class- compares winnings with the use of the Raceable interface
public class RaceHorse extends Horse
        implements Raceable, Comparable<Raceable> {

    private Horse sire;
    private Horse dam;
    private String registrationNum;
    private int yearFirstRaced;
    private int numRaces;
    private double winnings;

    public RaceHorse(String name, double height, double weight,
                     int yearBorn, String color, String breed,
                     Horse dam, Horse sire,
                     String registrationNum,
                     int yearFirstRaced,
                     int numRaces,
                     double winnings) {

        super(name, height, weight, yearBorn, color, breed);

        //Constructor
        this.dam = dam;
        this.sire = sire;
        this.registrationNum = registrationNum;
        this.yearFirstRaced = yearFirstRaced;
        this.numRaces = numRaces;
        this.winnings = winnings;
    }
    //Getters
    public Horse getSire() { return sire; }
    public Horse getDam() { return dam; }
    public int getNumRaces() { return numRaces; }
    //Total winnings
    public double getWinnings() {
        return winnings;
    }
    //Average winnings per race
    public double getAverageWinnings() {
        if (numRaces == 0) return 0;
        return winnings / numRaces;
    }
    //Comparison between average winnings.
    public int compareTo(Raceable r) {
        return Double.compare(
                this.getAverageWinnings(),
                r.getAverageWinnings());
    }

    //Horse info
    public String toString() {
        return "Race Horse Name: " + getName() +
                ", Height: " + getHeight() +
                ", Weight: " + getWeight() +
                ", Year Born: " + getYearBorn() +
                ", Color: " + getColor() +
                ", Breed: " + getBreed() +
                "\n   Sire: " + sire.getName() +
                "\n   Dam: " + dam.getName() +
                "\nRegistration Number: " + registrationNum +
                ", Year First Raced: " + yearFirstRaced +
                ", Num Races: " + numRaces +
                ", Winnings: " + winnings;
    }
}
