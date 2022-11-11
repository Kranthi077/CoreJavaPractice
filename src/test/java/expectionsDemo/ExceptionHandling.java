package expectionsDemo;

import java.awt.print.Printable;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 1, b = 0, c, d;

		int[] arr = { 1, 2, 3 };

		try { // always try should present with catch block or finally block
			//c = a / b;
			//int i = arr[3];
		}

		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("in IndexOutOfBoundsException");
		}

		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("in ArithmeticException");
		} catch (Exception e) { // this will atch the exception/message and stores it inside object e
			// System.out.println(e);
			e.printStackTrace();
			System.out.println("in Exception ");

		}

		finally {
			System.out.println("delete cookies");
			System.out.println("close browser");
		}

		d = a * b;
		System.out.println("d value is - " + d);

	}

}
