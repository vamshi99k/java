
public class Question27 {
	static void evenodd(int ar[]) {
		int count[]= {0,0};
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				count[0]++;

			} else {
				count[1]++;
				

			}
		}
		System.out.println("evensum=" + count[0]);
		System.out.println("oddsum=" + count[1]);

	}

	public static void main(String[] args) {
		int ar[] = { 12, 3, 34, 6, 8, 9, };
		evenodd(ar);

	}

}
