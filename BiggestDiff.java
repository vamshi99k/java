package basicprograms;

public class BiggestDiff {

	public static void main(String[] args) {
		int a[]= {2,3,10,2,4,8,1};
		System.out.println(check(a));
		
		

	}
	public static int check(int a[]) {
		int diff=0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if(diff<a[i]-a[j]) {
					diff=a[i]-a[j];
				}
				
			}
			
		}
		return diff;
	}

}
