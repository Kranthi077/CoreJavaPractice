package inheritance;

public class ChildClassKTMduke extends ParentClassVehicle {

	public void bikeColour() {

		String color = colour;

		System.out.println("bike is coloured as - " + color);
	}

	public void bikeType() {

		System.out.println("This is duke");
	}

	public static void main(String[] args) {

		ChildClassKTMduke KTMduke1 = new ChildClassKTMduke();
		KTMduke1.engine();
		KTMduke1.tyres();
		KTMduke1.brakes();
		KTMduke1.bikeColour();
		KTMduke1.bikeType();
		
	}

}
