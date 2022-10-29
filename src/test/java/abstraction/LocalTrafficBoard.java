package abstraction;

public class LocalTrafficBoard implements InternationalTrafficBoard {

	public void goWhenGreen() {
		System.out.println("Show bright green light for 2 mins");
		System.out.println(p);
	}

	public void stopWhenRed() {
		System.out.println("Show bright redLight for 1 min");
	}

	public void readyWhenOrange() {
		System.out.println("show blinking orange for 10 secs");
	}
	
	public void walkOnFootPathOnly() { // concrete methods
		System.out.println("People should walk on footpath only");
	}
	
	public void crossThroughZebraCrossing() {
		System.out.println("People should cross Through Zebra Crossing only");
	}

	public static void main(String[] args) {

		
		InternationalTrafficBoard trafficLights = new LocalTrafficBoard();
		trafficLights.stopWhenRed();
		trafficLights.readyWhenOrange();
		trafficLights.goWhenGreen();
		
		// create an obj of the class referring to same class
		LocalTrafficBoard trafficLightsLocal = new LocalTrafficBoard();
		trafficLightsLocal.walkOnFootPathOnly();
		trafficLightsLocal.crossThroughZebraCrossing();

		
	}

}
