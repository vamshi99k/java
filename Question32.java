
public class Question32 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int n1=6;
		int n2=5;
		boolean r =false;
		for(int i:ar)
		{
			 r=(i!=n1&&i!=n2);
			
		}
		if(r)
			System.out.println("flase");
		else
		   System.out.println("true");
		

	}

}
