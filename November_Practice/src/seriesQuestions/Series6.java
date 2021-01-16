package seriesQuestions;
/*Expected O/p:
 * ABCD
 * ABC
 * AB
 * A
 */
public class Series6 {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		for(int i = 1; i<=4 ;i++)
		{
			int a = 65;
			for(int j=4;j>=i;j--)
			{
				System.out.print((char)a);
				a++;
			}
			System.out.println();
			
		}
		Series6 s = new Series6();
		s.oneMoreSeries();

	}
	
	public void oneMoreSeries()
	{
		for(int i = 1; i<=4 ;i++)
		{
			//int a = 65;
			for(int j=4;j>=i;j--)
			{
				System.out.print((j));
				//a++;
			}
			System.out.println();
			
		}
	}

}
