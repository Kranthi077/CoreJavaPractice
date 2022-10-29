package abstraction;

public class localFlight extends ClassA {

	@Override
	public void logo() {
		System.out.println("Logo decided");
	}
	
	

	public static void main(String[] args) {
		localFlight Spicejet = new localFlight();
		Spicejet.engine();
		Spicejet.navigationRules();
		Spicejet.safetyGuideLines();
		Spicejet.colour();
		Spicejet.logo();

	}

}
