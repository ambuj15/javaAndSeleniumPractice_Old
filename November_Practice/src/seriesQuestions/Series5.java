package seriesQuestions;
/*Expected o/p:
 *     *
 *    **
 *   ***
 *  ****
 */

public class Series5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i = 1;i<=4;i++ )
		{
			for(int j =4;j>=i;j--)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
				else
					System.out.print("");
			}
			System.out.println();
		}

	}

}
