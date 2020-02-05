
 package basicprograms;

import java.util.Scanner;

public class Primeornot {
	static boolean isprime(int n)
	{
		int temp=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				temp=1;
				break;
			}
		}
		if(temp==0)
		{
			return true;
		}
		else
		{
			return false;
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  num;");
		int n=sc.nextInt();
		int sum=0,count=0;
		for(int i=2;i<=100;i++)
		{
			if(isprime(n))
			{
				sum+=i;
				count++;
				
			}
		}
		System.out.println(sum);
		System.out.println(count);
				
		
				

	}

}
