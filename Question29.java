
public class Question29 {

	public static void main(String[] args) {
		int ar[]= {5,4,2,7,9};
		double n=ar.length-2;
		int max=ar[0];
		int min=ar[0];
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			if(max<ar[i])
				max=ar[i];
			if(min>ar[i])
			  min=ar[i];
			
		}
		double avg=(sum-max-min)/n;
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
		
		

	}

}
