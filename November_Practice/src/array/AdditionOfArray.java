package array;

import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[] args) 
	{
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		//Taking input for 'a' matrix
		
		System.out.println("Enter values for matrix A");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		//Printing 'a' matrix
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				//a[i][j] = sc.nextInt();
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		//Taking input for matrix B
		System.out.println("Enter values for matrix B");
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		//Printing matrix B
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				//a[i][j] = sc.nextInt();
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		//Adding both Matrices
		
		System.out.println("Sum of matrices equals");
		for(int i = 0;i<c.length;i++)
		{
			for(int j = 0;j<c.length;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
		
	
	}

}
