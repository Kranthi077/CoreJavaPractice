package inheritance;


public class BSVIvehicles extends ChildClassKTMduke  {

	public void headLamp() {
		System.out.println("Head lamps should be always on");
		
		
	}
	
	public static void main(String[] args) {
		BSVIvehicles KTMduke1 = new BSVIvehicles();
		KTMduke1.engine();
		KTMduke1.tyres();
		KTMduke1.brakes();
		KTMduke1.bikeColour();
		KTMduke1.bikeType();
		KTMduke1.headLamp();

	}

}
