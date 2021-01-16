package seriesQuestions;

public class Series {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i = 1 ; i<=4; i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j);
			}
			//For printing in next row as first for loop is for printing rows.
			System.out.print("\n");
		}

	}

}
