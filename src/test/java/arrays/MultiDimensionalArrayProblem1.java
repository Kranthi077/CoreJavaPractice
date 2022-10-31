package arrays;

public class MultiDimensionalArrayProblem1 {
// this code is to find out minimum number from the array
	public static void main(String[] args) {

		int[][] d = { { 7, 2, 4 }, { 0, 17, 6 }, { 7, -7, 1 } };

		int min = d[0][0]; // 7

		for (int i = 0; i < d.length; i++) {

			for (int j = 0; j < d.length; j++) {

				if (d[i][j] < min) {   // 0 < 2

					min = d[i][j]; // min = 0
				}
			}
		}
		System.out.println(min);
	}
}

// you have to find out maximum  number