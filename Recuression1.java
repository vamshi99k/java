package basicprograms;

public class Recuression1 {
	static void print(int n)
	{
		if(n>0)
		{
			print(n-1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) 
	{
		print(10);

	}

}
