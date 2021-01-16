package seriesQuestions;
/*Expected output
 * A
 * BB
 * CCC
 * DDDD
 */

public class Series10 {

	public static void main(String[] args) 
	{
		int a = 65;
		// TODO Auto-generated method stub
		for(int i =1 ;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)a);
			}
			a++;
			System.out.println();
		}

	}

}
