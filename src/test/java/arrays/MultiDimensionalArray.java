package arrays;

public class MultiDimensionalArray {

	// print maximum number from minimum numbered column
	public static void main(String[] args) {

		int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, -10, 9 } };

		int min = d[0][0];
		int minColumn = 0;
		for (int i = 0; i < d.length; i++) {

			for (int j = 0; j < d.length; j++) {

				if (d[i][j] < min) {
					min = d[i][j];
					minColumn = j;
				}

			}

		}

		System.out.println(min);
		System.out.println(minColumn);

		int maxNum = d[0][minColumn];

		for (int i = 0; i < d.length; i++) {

			if (d[i][minColumn] > maxNum) { // 7 > 1

				maxNum = d[i][minColumn]; // max = 7
			}

		}

		System.out.println("max number in min column is = " + maxNum);
	}

}


// 
