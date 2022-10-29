package abstraction;

public interface InternationalTrafficBoard {

	// all the methods are abstract i.e., they does not have body
	// by default all the variables in interface are treated as public
	
	int p =2; 
	
	void goWhenGreen(); // abstract methods

	public void stopWhenRed();

	public void readyWhenOrange();

}
