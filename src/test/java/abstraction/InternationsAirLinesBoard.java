package abstraction;

public abstract class InternationsAirLinesBoard {

	public void engine() {
		System.out.println("This engine is common for all the flights");

	}

	public final void safetyGuideLines() {
		System.out.println("This are the rules to be followed by all the flight companies");

	}

	public void navigationRules() {

		System.out.println("These navigation rules should be followed by all the flights");

	}

	public abstract void logo(); // abstarct method
	public abstract void colour();

}
