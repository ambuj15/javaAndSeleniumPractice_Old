package seriesQuestions;

public class ReverseNumber {
	
	public void reverse(int n)
	{
		int z = n,l,sum = 0;
		
		while(n>0)
		{
			l = n%10;
			//System.out.println(l);
			sum = sum*10 + l;
			n= n/10;
			
		}
		if (z==sum)
		{
			System.out.println("Palindrome nmber");
		}
		else
			System.out.println("Not a palindrome");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReverseNumber r = new ReverseNumber();
		
		r.reverse(121);
		r.reverse(13331);
		r.reverse(112121);
		
	}

}
