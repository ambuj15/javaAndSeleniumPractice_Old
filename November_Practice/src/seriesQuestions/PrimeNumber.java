package seriesQuestions;

import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) 
	{
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check for prime.");
		
		int n= sc.nextInt();
		
		//To check number entered should be greater than 1
		if(n<=1) 
		{
		 System.out.println(n + " is not valid, please enter some other number");
         n = sc.nextInt();
		}
		
		
		for(int i = 2;i<=n/2;i++)
		{
			if(n%i == 0)
			{
				flag=1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime number");
		sc.close();
		
	}

}

