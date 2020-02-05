
public class Question12 {
	
	static void findduplicates(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j]&&i!=j)
				{
					System.out.print(ar[i]+" ");
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int ar[]= {1,2,3,1,2,3,4,5,5};
		findduplicates(ar);
		

	}

}
