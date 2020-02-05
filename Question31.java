
public class Question31 {

	public static void main(String[] args) {
		int ar[]= {10,10,10,3,4,5};
		
		int ten=10;
		int thirty=30;
		int t=0;
		for(int i:ar)
		{
			if(i==10)
				t+=i;
			if(t>thirty)
				break;
			
		}
		if(t==thirty)
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("fasl");
		}
		

	}

}
