package importantKeywords;

public class SuperChild extends ParentDemo {

	String name = "wealus";

	public SuperChild() {
		
		System.out.println("Child class constructor");
	}

	public SuperChild(int a) {
		// this super keyword should be the first line in constructor
		super(10);
		System.out.println("Child class constructor " + a);
		
	}

	public void printName() {

		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {

		System.out.println("I am from Child class");
	}

	public void callMethod() {
		// getData();
		super.getData();
	}

	public static void main(String[] args) {

		SuperChild ob = new SuperChild(7);
		// ob.printName();
		// ob.callMethod();

	}

}
