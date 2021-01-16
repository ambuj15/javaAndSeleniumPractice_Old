package functions;

import java.util.Scanner;

public class Add3 
{
	public int add ()
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter value of A");
		int a1 = sc.nextInt();
		
		System.out.println("Please enter value of B");
		int b1 = sc.nextInt();
		
		sum = a1+b1;
		sc.close();
		
		return sum;
		
	}

	public static void main(String[] args) 
	{
	    
		Add3 sm = new Add3();
		
		int ret = sm.add();
		
		System.out.println("Add = " + ret);
		

	}



}
