package seriesQuestions;
/*1234
  123
  12
  1
 * 
 */
public class Series9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i = 4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
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
