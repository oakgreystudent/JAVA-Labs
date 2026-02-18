/*
Jonathan Sliwa and Folu Amao
CS 210
2/18/2026
Lab 4 */

package Lab4;

//Class for racers
public abstract class Person {

    private String name;
    private int yearBorn;

    //Constructor
    public Person(String name, int yearBorn) {
        this.name = name;
        this.yearBorn = yearBorn;
    }
    //Getters
    public String getName() {
        return name;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public abstract String getDescription();
}
