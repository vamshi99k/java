package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		
		System.out.println("enter the" + n + "elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			System.out.print(ar[i] + " ");

		}
		System.out.println();
		Arrays.sort(ar);
		int z=ar.length;
		System.out.println(ar[z-1]);
		// TODO Auto-generated method stub

	}

}
