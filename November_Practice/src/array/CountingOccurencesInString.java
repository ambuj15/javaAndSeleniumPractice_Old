package array;

public class CountingOccurencesInString {

	public static void main(String[] args)
	{
	/*String s = new String(); int flag = 0; int count =0;
	s= "AmbujAAAA";
	int length = s.length();
	//char a[] = s.toCharArray();
	for(int i = 0; i <length;i++)
	{
		for(int k = i-1;k>=0;k--)
		{   flag =0;
			if(s.charAt(i) == s.charAt(k))
			{
				flag = 1;
				break;
			}
		}
		if(flag ==0)
		{
			count =0;
			for(int j = i;j<length;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			System.out.println(s.charAt(i) + " is occuring " + count + " time ");
		}
		
	}*/
		int count = 0;
		char o= ' ';
		String a = "ABCDEFAAAA";
		
		char []c = a.toCharArray();
		int flag = 0;

		
		for(int i = 0;i<c.length;i++)
		{
			for(int j = i-1;j>=0;j--)
			{
				if(c[i]==c[j])
				{
					count++;
					flag = 1;
					break;
				}
			}
			
			System.out.println(a.charAt(i) + "'s occurence numer" + (count+1) );
			}
		
		
	}

}
