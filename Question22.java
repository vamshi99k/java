

public class Question22 {
	
	static void pairsum(int ar[],int input)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==input)
				{
					System.out.println(ar[i]+"+"+ar[j]+"="+input);
				}
			}
		}
	}

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8};
		int input =6;
		pairsum(ar,input);

	}

}
