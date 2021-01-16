package array;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s = new String("Ambuj");
		
		char a[] = s.toCharArray();
		
		for(int i = a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}

	}

}
