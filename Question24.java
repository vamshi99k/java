
public class Question24 {
	
	public static void main(String[] args) {
		
		int ar[]= {1,2,3,4,6,7};
		int n=7;
		int expsum=0;
		int sum=0;
		expsum=n*(n+1)/2;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];

		}
		System.out.println(expsum-sum);
		
			
		
		
	}

}
