package seriesQuestions;

import java.util.Scanner;

class A
{

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a [] = new int [5];
		System.out.println("Enter series of elements in array");
	for(int i = 0; i<a.length;i++) 
	{
		a[i] = sc.nextInt();
	}
	for(int i = 0; i<a.length - 1;i++) 
	{
	
	if(a[i+1] != (a[i +2] - a [i+1]))
	{
		System.out.println("Missing number is : " + (a[i] + 1));
		break;
	}
	}
	}
}