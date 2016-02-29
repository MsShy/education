package task2;

import java.util.Scanner;

public class Massiv {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("vvedite n=");
		int n=in.nextInt();
		if(n%2!=0)
	 {System.out.print(" vvedite parnoe kol-vo elementov v massive");}
		else
		{System.out.print("vvedite massiv=");
		int[] number=new int[n];
		for (int i = 0; i < n; i++) 
		{
         number[i] = in.nextInt();
		}
		in.close();	
     int[] sum=new int[number.length/2];
	 int max = sum[0];
	 	for(int i=0;i<number.length/2; i++)
	 	{
			
	    	sum[i]=number[i]+number[number.length-i-1];
	    		if(sum[i]>max)
		        max = sum[i];
			 
		}
	System.out.println("max="+max);
	}
}

}
