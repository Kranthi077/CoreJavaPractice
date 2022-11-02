package constructorsConcept;

public class ConstructorDemo {
	String JsonPath;
	// no-arg constructors
	public ConstructorDemo() {
		JsonPath = "jsoanpath.json";
		System.out.println("This is a constructor");
	}

	//parametrised constructors
	public ConstructorDemo(int i) {
		System.out.println(i);
		System.out.println("This is a parametrised constructor");
	}

	public ConstructorDemo(int i, String a) {
		System.out.println(i);
		System.out.println("This is a parametrised constructor");
	}

	public void getData() {

		System.out.println("This is a normal method");
	}

	public static void main(String[] args) {

		ConstructorDemo con = new ConstructorDemo();
		ConstructorDemo con1 = new ConstructorDemo(7);
		ConstructorDemo con2 = new ConstructorDemo(7, "String");
		con.getData();
	}

}
