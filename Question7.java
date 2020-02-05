import java.util.Scanner;

public class Question7 {
	
	static int[] insertatspecificindex(int ar[],int elm,int pos)
	{
		if(pos<0||pos>ar.length-1)
		{
			System.out.println("index out of range");
			return ar;
			
			
		}
		int ar1[]=new int[ar.length+1];
		ar1[pos]=elm;
		for(int i=0;i<ar.length;i++)
		{
			if(i<pos)
			{
				ar1[i]=ar[i];
				
			}
			else
			{
				ar1[i+1]=ar[i];
				
			}
		}
		return ar1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		int elm=sc.nextInt();
		int pos=sc.nextInt();
		
		int c[]=insertatspecificindex(ar,elm,pos);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	

	}

}
