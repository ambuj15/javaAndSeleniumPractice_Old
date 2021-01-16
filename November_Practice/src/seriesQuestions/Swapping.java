package seriesQuestions;

import java.util.Scanner;

//Using two variables

public class Swapping {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A" );
		a= sc.nextInt();
		System.out.println("Enter value of B" );
		b=sc.nextInt();
				
		if(a>b)
		{
			a=a-b;
			b=a+b;
			a=b-a;
			
			System.out.println("A ="+a+","+"B="+b);
			
		}
		else
		{
			b=b-a;
			a=a+b;
			b=a-b;
			System.out.println("A ="+a+","+"B="+b);
		}
		sc.close();

	}

}
