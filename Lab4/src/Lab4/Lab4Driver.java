/*
Jonathan Sliwa and Folu Amao
CS 210
2/18/2026
Lab 4 */

package Lab4;

import java.util.Arrays;

public class Lab4Driver {

    public static void main(String[] args) {

        // Parent horses
        Horse sire1 = new Horse("Imperatrice", 15.3, 1050, 1948, "Bay", "Thoroughbred");
        Horse dam1 = new Horse("Princequillo", 16.0, 1100, 1940, "Chestnut", "Thoroughbred");

        Horse sire2 = new Horse("Nasrullah", 15.2, 1080, 1940, "Bay", "Thoroughbred");
        Horse dam2 = new Horse("Miss Disco", 15.3, 1040, 1944, "Chestnut", "Thoroughbred");

        // RaceHorses
        RaceHorse horse1 = new RaceHorse(
                "SomethingRoyal", 16.0, 1100, 1952,
                "Chestnut", "Thoroughbred",
                dam1, sire1,
                "666777888", 1954, 1, 0.0);

        RaceHorse horse2 = new RaceHorse(
                "Bold Ruler", 16.1, 1200, 1954,
                "Bay", "Thoroughbred",
                dam2, sire2,
                "1112223333", 1956, 33, 764204.0);

        // Drivers
        RaceCarDriver driver1 = new RaceCarDriver(
                "Lewis Hamilton", 1985,
                "Great Britain", 288, 103, 70000000);

        RaceCarDriver driver2 = new RaceCarDriver(
                "Michael Schumacher", 1969,
                "Germany", 309, 91, 780000000);

        //Store in Array
        Raceable[] racers = { driver1, horse1, driver2, horse2 };
        //Prints Unsorted array
        System.out.println("************ UNSORTED ARRAY ***************");
        for (Raceable r : racers) {
            System.out.println(r);
            System.out.println("================");
        }

        //Sorts by average winnings
        Arrays.sort(racers);
        
        //Prints sorted array
        System.out.println("************ SORTED ARRAY ***************");
        for (Raceable r : racers) {
            System.out.println(r);
            System.out.println("Average winnings: "
                    + r.getAverageWinnings()
                    + " per race run.");
            System.out.println("================");
        }
    }
}
