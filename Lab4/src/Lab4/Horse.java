/*
Jonathan Sliwa and Folu Amao
CS 210
2/18/2026
Lab 4 */

package Lab4;

//Class for horses in general
public class Horse {

    private String name;
    private double height;
    private double weight;
    private int yearBorn;
    private String color;
    private String breed;
    //Constructor
    public Horse(String name, double height, double weight,
                 int yearBorn, String color, String breed) {

        this.name = name;
        this.height = height;
        this.weight = weight;
        this.yearBorn = yearBorn;
        this.color = color;
        this.breed = breed;
    }
    //Getters
    public String getName() { return name; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    public int getYearBorn() { return yearBorn; }
    public String getColor() { return color; }
    public String getBreed() { return breed; }

    public String toString() {
        return "Horse Name: " + name;
    }
}
