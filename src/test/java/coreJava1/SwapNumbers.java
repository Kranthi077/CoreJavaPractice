package coreJava1;

public class SwapNumbers {

	public static void main(String[] args) {
		// swapping two numbers using third variables

		int a = 2, b = 3, c;

		c = a;// c=2
		a = b; // a=3
		b = c;
		System.out.println("a is - " + a + "\nb is - " + b);

		System.out.println();
		int p = 2, q = 3;

		p = p + q; // p = 2 + 3 = 5
		q = p - q;// q = (2+3) - 3 = 2
		p = p - q;// p = (2+3) - 2 = 3

		System.out.println("p is - " + p + "\nq is - " + q);

	}

}
