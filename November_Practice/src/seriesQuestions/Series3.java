package seriesQuestions;
/*Expected output:
 * A
 * AB
 * ABC
 * ABCD
 */

public class Series3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i = 1;i<=4;i++)
		{
			int a = 64;                           //a = 65
			for(int j = 0 ; j<=i-1 ; j++)         //for(int j = 0 ; j<=i-1 ; j++)
			{                                     //{
				 a = a + 1;                       // syso((char)a);
				 								  //a++;
				 System.out.print((char)a);
			}
			System.out.println();
		}

	}

}
