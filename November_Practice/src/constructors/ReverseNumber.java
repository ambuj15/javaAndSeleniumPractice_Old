package constructors;

public class ReverseNumber {
	

	public static void main(String[] args)
	{
		int sum = 0; int x =123; int l;
		for(int i = 0;i<3;i++)
		{
			l = x%10;
			sum = sum*10 + l;
			x=x/10;
		}
		System.out.println(sum);
		
	}

}
