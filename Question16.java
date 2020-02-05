

import java.util.Scanner;

public class Question16 {
	static int[] removeduplicates(int ar[])
	{
		int b[]=new int[ar.length];
		b[0]=ar[0];
		int k=1;
		for(int i=0;i<ar.length;i++)
		{
			int j=k-1;
			while(j>=0&&b[j]!=ar[i])
			{
				j--;
			}
			if(j==-1)
			{
				b[k++]=ar[i];
				
			}
		}
		int res[]=new int[k];
		for(int i=0;i<k;i++)
		{
			res[i]=b[i];
		}
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[8];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
		ar = removeduplicates(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	

}
}
