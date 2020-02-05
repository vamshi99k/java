
public class Question11 {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6};
		for(int i=0;i<ar.length/2;i++)
		{
			int t=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=t;
			
			
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		

	}


}
