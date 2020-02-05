import java.util.Scanner;

public class Question10 {
	static void findmaxmin(int ar[])
	{
		int max=ar[0];
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		findmaxmin(ar);
	}

}
