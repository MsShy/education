package task2;
import static java.lang.Math.*;

import java.util.Scanner;
public class Cycle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a= ");
		int a = in.nextInt();
		System.out.print("b= ");
		int b = in.nextInt();
		System.out.print("h= ");
		double h = in.nextDouble();
		in.close();
	   System.out.printf("%-8s%-8s%n","i","Znacheniya funkcii");
	    System.out.println("-----------------------");
	for (double i=a; i<=b; i+=h){
    double f=tan(i*2)-3;
    
        System.out.printf("%-8.2f%-8.4f%n",i,f);
     
    }
		
}
}