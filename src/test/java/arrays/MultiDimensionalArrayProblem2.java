package arrays;

public class MultiDimensionalArrayProblem2 {

	public static void main(String[] args) {

		int[][] c = new int[2][3];
		/*
		 * c[0][0] = 1; c[0][1] = 7; c[0][2] = 3; c[1][0] = 4; c[1][1] = 9; c[1][2] = 6;
		 * c[2][0] = 5; c[2][1] = 0; c[2][2] = 2;
		 */

		System.out.println(c.length);
		// System.out.println(c[1][2]);

		int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < d.length; i++) {

			for (int j = 0; j < d.length; j++) {

				System.out.print(d[i][j] + " ");// 2 2
			}
			System.out.println();
		}

	}

}
// find out min number in maximum numbered column