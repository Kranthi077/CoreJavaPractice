package accessSpecifiers;

public class ClassA {
	public String name = "Selenium";
	int a = 7; // default
	private String data = "wealus";
	protected String type = "protected";

	public void getData() {
		System.out.println("This is to demonstrate public keyword");
	}

	void defaultMethod() { // made default

		System.out.println("This is to demonstrate default type access modifier");
	}

	private void privateKeyword() { // made default

		System.out.println("This is to demonstrate default private Keyword");
	}

	protected void protectedKeyword() { // made default

		System.out.println("This is to demonstrate default protected Keyword");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
