package basicprograms;

import java.util.Scanner;

public class Factorialofno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
			
		}
		System.out.println("the factorial of given no is:"+fact);
	
		
				

	}

}
