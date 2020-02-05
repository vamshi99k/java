package basicprograms;

import java.util.Scanner;

public class Perfectno {
	 static int isperfect(int n)
	 {
		 int perf=0;
			 for(int i=1;i<=n/2;i++)
			 {
				 if(n%i==0)
				 {
					 perf=perf+i;
				 }
			 
		 }
		 return perf;
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the perefect number");
		int n=sc.nextInt();
		int res=isperfect(n);
		if(res==n)
		{
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("it is not perfect no");
		}

	}

}
