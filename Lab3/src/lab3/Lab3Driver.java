package lab3;

public class Lab3Driver {
	
	private String fielName;
	private String propertyType;
	private double price;
	
	public static void main(String[] args) {

		// class instantiations
		MultiFamily family = new MultiFamily(0, "address", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3, 6, 9, 3, 4);
		
		Townhouse town = new Townhouse(0, "address", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3, 1, 2, 3, 4);
		
		Condo condo = new Condo(0, "address", "zip", "loca", 19, 13.3, 0, "avail", 101.2, 101.3, 1, 2, 3, 4);

		SingleFamily single = new SingleFamily(0, "address", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3, 1, 2, 3, 4);

		Land land = new Land(0, "address", "zip", "loca", 19, 13.3, 0, "avail", 101.2, 101.3, 1, 2, 3, 4);

		// printing addresses
		System.out.println("Multi-Family at: " + family.getaddress() + " can lodge " + family.getnumFamilies() + " families.");
		System.out.println("Townhouse at: " + town.getaddress());
		System.out.println("Condo at: " + condo.getaddress());
		System.out.println("SignleFamily at: " + single.getaddress());
		System.out.println("Land at: " + land.getaddress());
	}
	
	public void printProperties(String String) {}
	
	public void printPropertiesPrice(String Double) {}
}
