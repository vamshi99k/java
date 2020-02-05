package basicprograms;

public class Recurresion2 {
	static int gcd(int m, int n)
	{
		if(m<n)
		{
			return gcd(n,m);
		}
		if(n==0)
			
		{
			return m;
			
		}
		return gcd(n,m%n);
	}

	public static void main(String[] args) {
		int f=gcd(21,28);
		System.out.println(f);
		
		
	}

}
