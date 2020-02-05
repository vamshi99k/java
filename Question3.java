import java.util.Scanner;

public class Question3 {
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
        for(int i=0;i<ar.length;i++)
        {
        	sum=sum+ar[i];
        }
		System.out.println(sum);

}
}