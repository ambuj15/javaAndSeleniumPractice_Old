package seriesQuestions;

//import java.util.Scanner;

/*Expected output
 * 1
 * 23
 * 456
 * 78910
 * 
 */

public class Series2 {

	public static void main(String[] args) {
		int s = 0;
		// TODO Auto-generated method stub
		for(int i = 1;i<=4;i++)
		{
			for(int j = 0; j<=i-1;j++)
			{
				s = s+1;
				System.out.print(s);
			}
			System.out.print("\n");
		}
		Series2 se = new Series2();
		se.ser();

	}

	/*Expected output
	 * A
	 * BC
	 * DEF
	 * GHIJ 
	 */
	public void ser()

	{
		int c = 65;
		// TODO Auto-generated method stub
		for(int i = 1;i<=4;i++)
		{
			for(int j = 0; j<=i-1;j++)
			{
				System.out.print((char)c);
				c++;
			}
			System.out.print("\n");
		
		}

}
}
