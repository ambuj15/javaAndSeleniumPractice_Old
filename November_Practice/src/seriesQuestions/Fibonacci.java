package seriesQuestions;
/*Using two variables*/

public class Fibonacci {

	public static void main(String[] args) 
	{
		int a = 0 , b =1;
		
		System.out.print(" " +a + " " + b);
		
		for(int i = 0 ; i<10;i++)
		{
			a = a+b;
			b = a+b;
			System.out.print(" "+a + " " + b + " ");
		}
	}

}
