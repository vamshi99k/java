
public class Question13 {
	static void findduplicates(String ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i].equals(ar[j]))&&(i!=j))
				{
					System.out.print(ar[j]+" ");
					
				}
			}
		}
	}

	public static void main(String[] args) {
		String ar[]= {"vamshi","vamshi","vamc"};
		findduplicates(ar);
		

}
}
