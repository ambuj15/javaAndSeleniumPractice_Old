package seriesQuestions;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=4;i++)
		{
			int k=i-1;
			for(j=1;j<=4-i;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(j);
			for(j=1;j<=i;j++)
			{
				if(k!=0)
				System.out.print(k);
				k--;
			}
			System.out.println();
		}
	
		for(i=1;i<=3;i++)
		{
			int k=3-i;
			for(j=1;j<=i;j++)
				System.out.print(" ");
			for(j=1;j<=4-i;j++)
				System.out.print(j);
			for(j=1;j<=4-i;j++)
			{
				if(k!=0)
				{
				System.out.print(k);
				k--;
				}
			}
			System.out.println();
		}
	
			

	}

}
