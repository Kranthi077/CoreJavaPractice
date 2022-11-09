package importantKeywords;

public class ThisDemo {
	String name = "wealus"; // global variable

	int a = 5;

	public void getData() {

		String name = "Selenium"; // local variabe- local to getdata method

		System.out.println(name);
		System.out.println(this.name);

	}

	public void sum() {
		int a = 8;

		System.out.println(a + this.a);
	}

	public void printsum() {
		System.out.println(a + a);

	}

	public static void main(String[] args) {

		ThisDemo ob = new ThisDemo();
		ob.getData();
		ob.sum();
	}

}
