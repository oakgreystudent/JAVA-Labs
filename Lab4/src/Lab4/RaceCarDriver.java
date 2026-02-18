/*
Jonathan Sliwa and Folu Amao
CS 210
2/18/2026
Lab 4 */


package Lab4;

//Extension of person class - Uses Raceable interface to compare winnings
public class RaceCarDriver extends Person
        implements Raceable, Comparable<Raceable> {

    private String country;
    private int starts;
    private int wins;
    private double winnings;

    //Constructor
    public RaceCarDriver(String name, int yearBorn, String country,
                         int starts, int wins, double winnings) {

        super(name, yearBorn);
        this.country = country;
        this.starts = starts;
        this.wins = wins;
        this.winnings = winnings;
    }
    //Getters
    public String getCountry() { return country; }
    public int getStarts() { return starts; }
    public int getWins() { return wins; }
    //Total winnings
    public double getWinnings() {
        return winnings;
    }
    //Average winnings per race
    public double getAverageWinnings() {
        if (starts == 0) return 0;
        return winnings / starts;
    }
    //Comparison by average winnings
    public int compareTo(Raceable r) {
        return Double.compare(
                this.getAverageWinnings(),
                r.getAverageWinnings());
    }

    public String getDescription() {
        return "Race Car Driver";
    }
    //Driver info
    public String toString() {
        return "Race Car Driver Name: " + getName() +
                ", Country: " + country +
                ", Year Born: " + getYearBorn() +
                "\nStarts: " + starts +
                ", Wins: " + wins +
                ", Winnings: " + winnings;
    }
}
