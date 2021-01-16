package seriesQuestions;

import java.util.Scanner;

public class VerticalHistogram {
	
	public static void main(String args[])
	{
		int a[]=new int[5];
		int max=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		for(int i=0;i<max;i++)
		{
			for(int j=0;i<a.length;j++)
			{
			if(a[j]<max)
				System.out.print("_");
			else
			{
				System.out.print("*");
				a[j]=a[j]-1;
			}
			}
			System.out.println();
		}
	}

}
