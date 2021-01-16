package array;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) 
	{
		int flag = 0;
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements in array.");
		for(int i=0;i< a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Elements in array are : ");
		for(int i =0;i<a.length;i++)
		{
			System.out.print(" "+a[i] + "\n");
		}
		
		System.out.println("Enter element to search");
		int n = sc.nextInt();
	
		for(int i = 0 ; i<a.length;i++)
		{
			if(n==a[i])
			{
				flag++;
				break;
			}

		}
		if(flag == 1)
		{
			System.out.println("Element found");
		}
		else
			System.out.println("Element not found");
		sc.close();

	}

}
