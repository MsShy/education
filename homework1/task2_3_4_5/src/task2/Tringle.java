package task2;
import java.util.Scanner;

import static java.lang.Math.*;
public class Tringle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("a= ");
		int a = in.nextInt();
		System.out.print("b= ");
		int b = in.nextInt();
		in.close();
		double s=(a*b)*0.5;
		System.out.println("площадь="+s);
		
		double c=sqrt(pow(a,2)+pow(b,2));
	    System.out.println("гипотенуза="+c);
	    double p=a+b+c;
	    System.out.println("периметр="+p);		
		
	}
}

	


