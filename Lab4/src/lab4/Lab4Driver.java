package lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab4Driver {
	
    public static void main(String[] args) {

		// class instantiations
		RaceHorse racehorse = new RaceHorse("Max", 5.5, 400, 2006, "white", "stallion", "12345567", 2010, 10, 555.55);
		RaceHorse racehorse2 = new RaceHorse("Mary", 5.5, 400, 2006, "white", "stallion", "12345567", 2010, 10, 555.55);
		
		// create array and store class objects
		ArrayList<RaceHorse> array = new ArrayList<RaceHorse>();
		array.add(racehorse);
		array.add(racehorse2);
		
		System.out.println("*****UNSORTED ARRAY*****");
		System.out.println(array); // print the array
		System.out.println("*****SORTED ARRAY*****");
		// sort the array
		//Arrays.sort(array, new racehorse.compareTo());
		Collections.sort((array);
		System.out.println(array);

    }
}
