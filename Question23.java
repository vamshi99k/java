

public class Question23 {
	
	static void checkarryequals(int ar1[],int ar2[])
	{
		boolean status=true;
		if(ar1.length==ar2.length)
		{
			for(int i=0;i<ar1.length;i++)
			{
				if(ar1[i]!=ar2[i]) {
					status=false;
				}
			}
			
		}
		else
		{
			status=false;
		}
		if(status)
		{
			System.out.println("arrays are equal");
			
		}
		else
		{
			System.out.println("arrys are not equal");
		}
	}

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5};
		int ar2[]= {1,2,3,4,5};
		checkarryequals(ar1,ar2);
		

	}

}
