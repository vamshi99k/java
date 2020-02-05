import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr number of elements ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        {
        	ar[i]=sc.nextInt();
        }
        int sum=0;
        int avg=0;
        for(int i=0;i<ar.length;i++)
        {
        	sum=sum+ar[i];
        	avg=avg+sum/ar.length;
        }
        System.out.println("the avg of array elements is:");
        System.out.println(avg);
        
		// TODO Auto-generated method stub

	}


}
