package Lab4;

public abstract class Person {

    private String name;
    private int yearBorn;

    public Person(String name, int yearBorn) {
        this.name = name;
        this.yearBorn = yearBorn;
    }

    public String getName() {
        return name;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public abstract String getDescription();

    public String toString() {
        return "Name: " + name + ", Year Born: " + yearBorn;
    }
}