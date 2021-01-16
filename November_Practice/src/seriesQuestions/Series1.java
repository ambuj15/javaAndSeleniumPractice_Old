package seriesQuestions;

/*Expected output
 *1
 *22
 *333
 *4444
 *55555
 */
public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i<=5; i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(i);
			}
			//For printing in next row as first for loop is for printing rows.
			System.out.print("\n");
		}

	}

}
