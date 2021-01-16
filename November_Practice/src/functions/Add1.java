package functions;

import java.util.Scanner;

public class Add1 {
	
	public  void add (int a , int b)
	{
		int sum = a+b;
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		Add1 sm = new Add1();
		
		System.out.println("Please enter value of A");
		int a1 = sc.nextInt();
		
		System.out.println("Please enter value of B");
		int b1 = sc.nextInt();

		sm.add(a1,b1);
		sc.close();

	}

}
