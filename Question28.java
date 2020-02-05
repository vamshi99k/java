
public class Question28 {
	public static void main(String[] args) {
		int ar[]={1,2,3,4,5,6,7,8};
		int diff=0;
		for(int i=1;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(diff<ar[i]-ar[j])
				{
					diff=ar[i]-ar[j];
					
				}
			}
		}
		System.out.println(diff);
		
	}

}
