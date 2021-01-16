package functions;

import java.util.Scanner;

public class Add2 
{
	public float add (float a , float b)
	{
		float sum = a+b;
		
		return sum;
		
	}

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		Add2 sm = new Add2();
		
		System.out.println("Please enter value of A");
		int a1 = sc.nextInt();
		
		System.out.println("Please enter value of B");
		int b1 = sc.nextInt();

		double ret = sm.add(a1,b1);
		
		System.out.println("Add = " + ret);
		
		sc.close();

	}


}
