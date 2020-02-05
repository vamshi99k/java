package basicprograms;

import java.util.Scanner;

public class Maxminelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int small,big;
		small=n%10;
		big=n%10;
		do {
			int r=n%10;
			if(r<+small)
			{
				small=r;
			}
			if(r>=big)
			{
				big=r;
			}
			n=n/10;
			
		}
		while(n!=0);
		System.out.println(small);
		System.out.println(big);
				
		

	}

}
