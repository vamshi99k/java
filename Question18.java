

public class Question18 {
	static int nthbiggest(int ar[],int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					count++;
				}
			}
			if(count==n-1)
			{
				return ar[i];
			}
		}
		return -1;
	}

		public static void main(String[] args) {
			int n = 2;
			int ar[] = { 1, 2, 3, 4, 5 };
			int res = nthbiggest(ar, n);
			System.out.println(res);
			// TODO Auto-generated method stub

		}
		// TODO Auto-generated method stub


}
