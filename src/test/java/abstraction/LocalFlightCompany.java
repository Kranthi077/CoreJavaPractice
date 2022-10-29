package abstraction;

public class LocalFlightCompany extends InternationsAirLinesBoard {

	@Override
	public void logo() {
		System.out.println("Indego");

	}

	@Override
	public void colour() {
		System.out.println("White & Blue combination");
	}

	
	//not possible since Abstract method is declared as final in abstract class 
	/*
	 * public void safetyGuideLines() {
	 * System.out.println("This are the updated rules for Indego flights"); }
	 */
	
	
	public static void main(String[] args) {

		//LocalFlightCompany Indego = new LocalFlightCompany();
		InternationsAirLinesBoard Indego = new LocalFlightCompany();
		Indego.engine();
		Indego.navigationRules();
		Indego.safetyGuideLines();
		Indego.logo();
		Indego.colour();
		
	}

}
