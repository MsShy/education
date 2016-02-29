package task2;

import java.util.Scanner;

public class TrueorFalse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("vvedite chislo chetyrehznachnoe= ");
		int num = in.nextInt();
		
		in.close();	
		
		if(num<=9999){
	int first=num/100;
	int one =first/10;
	int two =first%10;
	int third =num%100;
	int three =third/10;
	int four =third%10;
	int sum1=one+two;
	int sum2=three+four;
	
	System.out.println(sum1 == sum2);}
		else
			System.out.println("chislo ne chetyrehznachnoe");
	}

}
