package coreJava1;

import java.util.Iterator;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {// 1+1+1+1
			for (int j = 0; j < 4 - i; j++) { // 4+4+4+4
				System.out.print(j + "\t");
				// System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("seperation");

		for (int i = 0; i < 4; i++) {

			for (int j = 3 - i; j >= 0; j--) {

				System.out.print(j + "\t");

			}
			System.out.println();
		}

		System.out.println("seperation");

		int k = 10;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(k + "\t");
				k--;

			}
			System.out.println();
		}

		System.out.println("seperation");

		String r ="*";
		for (int i = 0; i < 4; i++) { // 1
			for (int j = 0; j <= i; j++) { // 1<=1

				System.out.print(r + "\t");
				
			}
			System.out.println();
		}
	}
}
//1 
//2 3 
//4 5 6
//7 8 9 10

//3 2 1 0
//2 1 0
//1 0
//0

//0 1 2 3
//0 1 2
//0 1
//0

//10 9 8 7
//6 5 4 
//3 2
//1

