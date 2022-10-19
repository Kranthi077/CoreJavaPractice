package coreJava1;

public class DoWhileLoop {

	public static void main(String[] args) {

		int i = 0;

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);// 11<=10 // do while will execute the statements inside it atleast once though
							// the condition fails

		int j = 10;

		do {
			System.out.println(j);
			j--;
		} while (j >= 0);

	}

}

/*
 * 1 2 3 4 5 6 7 8 9 10
 */