package seriesQuestions;

public class SumOfNumbersInString {

	public static void main(String[] args) 
	{
		String s = "1Ambuj4Goyal India 1";
		String [] s1 = s.split("[, .A-Z a-z ]");
		int sum = 0;
		
		for(int j =0;j<s1.length;j++)
		{
			if(s1[j].isEmpty())
			{
			continue;	
			}
			else
			{
				sum = sum + Integer.parseInt(s1[j]);
			}
		}
		System.out.println(sum);

	}

}
