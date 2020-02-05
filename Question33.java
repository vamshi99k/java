import java.util.Scanner;

public class Question33 {
	
		static int[] removeDuplicates(int[] ar) {
			int b[] = new int[ar.length];
			b[0] = ar[0];
			int k = 1;
			for (int i = 1; i < ar.length; i++) {

				int j = k - 1;
				while (j >= 0 && b[j] != ar[i]) {
					j--;
				}
				if (j == -1) {
					b[k++] = ar[i];
				}
			}
			int rs[] = new int[k];
			for (int i = 0; i < k; i++) {
				rs[i] = rs[i] + b[i];

			}
			return rs;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int ar[] = new int[8];
			for (int i = 0; i < ar.length; i++) {
				ar[i] = sc.nextInt();

			}
			ar = removeDuplicates(ar);
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i] + " ");
			}
		}

}
