package inheritance;

public class ChildClassKTMrc extends ParentClassVehicle {

	public void brakes() {
		System.out.println("this is abs braking system");
	}

	public void bikeColour() {

		String color = colour;

		System.out.println("bike is coloured as - " + color);
	}

	public void bikeType() {

		System.out.println("This is rc");
	}

	public static void main(String[] args) {

		ChildClassKTMrc KTMrc1 = new ChildClassKTMrc();
		ParentClassVehicle KTMrc2 = new ParentClassVehicle();
		KTMrc1.engine();
		KTMrc1.tyres();
		KTMrc1.bikeColour();
		KTMrc1.bikeType();
		KTMrc1.brakes();
		KTMrc2.brakes();

	}

}
