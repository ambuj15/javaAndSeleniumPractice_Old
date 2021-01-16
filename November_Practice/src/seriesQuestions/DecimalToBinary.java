package seriesQuestions;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		int n = 24; int r[] = new int[25]; int index = 0;
		while(n>0)
		{
		
			r[index] = n%2;
			n=n/2;
			index++;
		}
		for(int i=index-1;i>=0;i--)
		{
			System.out.println(r[i]);
		}
			
		
	}

}
