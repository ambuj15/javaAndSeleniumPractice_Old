package seriesQuestions;

public class Series12 {
	/*Expected output
	 * 1
	 * 10
	 * 101
	 * 1010
	 */

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

}
