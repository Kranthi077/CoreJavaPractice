package coreJava1;

public class SwitchDemo {

	public static void main(String[] args) {

		String name = "madhusud";

		switch (name) {
		case "prasant":
			System.out.println("reached prasant");
			int i = 1;
			System.out.println(i);
			break;

		case "venkat":
			System.out.println("reached venkat");
			break;

		case "madhu":
			System.out.println("reached madhu");
			break;

		default:
			// System.out.println("reached default");
		}

		int ab = 4;

		switch (ab) {
		case 1:
			System.out.println("reached prasant");
			int i = 1;
			System.out.println(i);
			break;

		case 2:
			System.out.println("reached venkat");
			break;

		case 3:
			System.out.println("reached madhu");
			break;

		default:
			// System.out.println("reached default");
		}

		char character = 'f';

		switch (character) {
		case 'a':
			System.out.println("reached prasant");
			int i = 1;
			System.out.println(i);
			break;

		case 'b':
			System.out.println("reached venkat");
			break;

		case 'c':
			System.out.println("reached madhu");
			break;

		default:
			System.out.println("reached default");
		}

	}

}
