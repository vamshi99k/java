import java.util.Scanner;

public class Question6 {
	
	
	static int findindex(int ar[],int  n)
	{
		int i=0;
		int l=ar.length-1;
		while(i<ar.length-1)
		{
			if(ar[i]==n)
				return i;
			i++;
			
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		System.out.println(findindex(ar,2));
	}

}
