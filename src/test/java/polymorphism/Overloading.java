package polymorphism;

// A class can contain more than one method with same name
// those two methods should have below differences
//-> either arguments type should be different
//-> number of arguments of that methods should be different

// If a class contains two or more methods with same name but differs in argument types or count. 
//Such methods is called overloading method. this concept is overloading
// Overloading is achieved in one class only

public class Overloading {

	public void getData(int a) {

		System.out.println(a);

	}

	public void getData(String a) {

		System.out.println(a);
	}

	public void getData(String a, int i) {

		System.out.println(a + "------" + i);
	}

	public void getData(int i, String a) {

		System.out.println("abc  " + i + "------" + a);
	}

	public void getData() {

		System.out.println("method with zero arguments");
	}

	public static void main(String[] args) {

		Overloading ob = new Overloading();
		ob.getData();
		ob.getData(7);
		ob.getData("Core Java");
		ob.getData("Selenium", 5);
		ob.getData(7, "Selenium");
	}

}
