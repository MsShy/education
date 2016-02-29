package task2;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	System.out.print("vvedite m=n=");
	int n=in.nextInt();
	int[][] matrixA =new int[n][n];
	in.close();	
		
	for (int i = 0; i < matrixA.length; i++)
	{
	    for (int j = 0; j < matrixA.length; j++) 
	    {   
	    	if(i==j || i+j==matrixA.length-1)
	    	matrixA[i][j] = 1;
	        System.out.print(matrixA[i][j] + "\t");
	    }
	    System.out.println();
	}	
}

}
