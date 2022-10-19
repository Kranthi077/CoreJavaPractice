package coreJava1;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		while (i <= 10) // 11<=10 - false // statements inside while loop will run only when conditions passes. 
		{
			System.out.println(i);
			i++;
		}
		
		

		int j = 10;
		while (j >= 0) // -1>=0 - false
		{
			System.out.println(j);
			j--;
		}

	}

}
