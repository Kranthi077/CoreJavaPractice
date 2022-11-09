package typesOfVariables;

public class StaticVariables {
//global variables
	String name;
	String add;
	String cituy;
	// static String city = "Hyderabad"; // this variable is class variables
	// static int petrolPrice = 110; // this variable is class variables
	String mileage;// instance
//static block
	static {
		String city = "Hyderabad";
		int petrolPrice = 110;
	}

	public StaticVariables(String name, String mileage) { // local variables

		this.name = name;
		this.add = add;
		// this.city = city;

	}

	static public void mileage() { // static method

		System.out.println("calculate mileage");
	}

	public void getdata() {
		System.out.println(name + "\n" + add + "\n");
	}

	public static void main(String[] args) {

		StaticVariables person1 = new StaticVariables("Santhosh", "Madhapur");
		person1.getdata();
		StaticVariables person2 = new StaticVariables("Venkat", "kukatpally");
		person2.getdata();

		StaticVariables swift = new StaticVariables("Swift", "21");
		swift.mileage();
		StaticVariables alto = new StaticVariables("Santhosh", "24");
		alto.mileage();

	}

}
