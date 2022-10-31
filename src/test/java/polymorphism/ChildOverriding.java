package polymorphism;

public class ChildOverriding extends ParentOverriding{
//This is HDFC
	
	// Parent methods are overridden in child class. This is by changing the method body by retaining the method name.
	// this is overriding
	// to achieve over riding. atleast two classes are required and inheritance concept should be used.
	
	public void interestRate() {
		
		System.out.println("I will use interest rate of 7% keeping my service in mind");
	}
	
	
	
	
	public static void main(String[] args) {
		ChildOverriding hdfc = new ChildOverriding();
		hdfc.interestRate();

	}

}
