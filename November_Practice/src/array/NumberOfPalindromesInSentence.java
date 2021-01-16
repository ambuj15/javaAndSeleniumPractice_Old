package array;
//Problem in this question

public class NumberOfPalindromesInSentence 
{

	public static void main(String[] args) 
	{
		String s = "varrav I am Ambuj,i speak MALAYALAM,my best friend is NITIN";
		
		String[] a = s.split("[ ,.]");
		//System.out.println(a.length);
		String rev= "";
		int count=0,length=0;
		for(int i = 0;i<a.length;i++)
		{
			/*for(int j =0;j<a[i].length();j++)
			{
				char[] b = a[j].toCharArray();
				
				for(int k = b.length-1;k>=0;k--)
				{
					System.out.println(b[0]);
				}
			}*/
			for(int j=a[i].length()-1;j>=0;j--) {
				rev=rev+a[i].charAt(j);
				
				
			}
			if(a[i].equalsIgnoreCase(rev)) {
				System.out.println(a[i]);
				count++;
				if(a[i].length()>length)
				{
				length=a[i].length();
				}
			}
			rev="";
			
		}
		System.out.println(count);
		System.out.println(length);

	}

}
