
public class Question14 {
	static void common(String ar1[],String ar2[])
	{
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
			{
				if((ar1[i].equals(ar2[j])))
				{
					System.out.print(ar1[j]+" ");
					
				}
			}
		}
	}

	public static void main(String[] args) {
		String ar1[]= {"vamshi","naresh","vamc"};
		String ar2[]= {"vamshi","yesh","vamc"};
		common(ar1,ar2);
	}

}
