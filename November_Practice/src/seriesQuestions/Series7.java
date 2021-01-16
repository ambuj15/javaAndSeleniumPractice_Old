package seriesQuestions;
/*Expected output
 * 1
 * 21
 * 321
 * 4321
 */

public class Series7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i = 1;i<=4;i++)
		{
			for(int j=i;j<=i;j--)
			{
				if(j==0)
				break;
				else
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
