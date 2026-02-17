package lab4;

public class Lab4Driver {
	
    public static void main(String[] args) {

		// class instantiations
		Horse horse = new Horse("Max", 5.5, 400, 2006, "white", "stallion");
		//horse.setaddress("453 Rearheaert Dr");
		RaceHorse racehorse = new RaceHorse("Max", 5.5, 400, 2006, "white", "stallion", "12345567", 2010, 10, 555.55);
		
		// printing
		System.out.println(horse.getName());
		System.out.println("Race Horse Name: " + horse.getName() + ", Height: " + horse.getHeight() + ", Weight: " + horse.getWeight() + ", Year born: " + horse.getYearBorn() + ", Color: " + horse.getColor() + ", Breed:" + horse.getBreed());
		System.out.println(racehorse.getName() + racehorse.getregistrationNum());

    }
}
