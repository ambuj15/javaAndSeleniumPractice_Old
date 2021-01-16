package functions;

import java.util.Scanner;

public class Add {
	
	public void add()
	{
		//For taking input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a");
		int a= sc.nextInt();
		
		System.out.println("Please enter b");
		int b= sc.nextInt();
		
		System.out.println("Value for A entered by user = "+ a);
		System.out.println("Value for b entered by user = "+ b);
		
		System.out.println("Sum = " + (a+b));
		
		//It is mandatory to close scanner class post using it else it will give a warning message "Resource scanner not closed"
		sc.close();
	}

	public static void main(String[] args) 
	{
	    Add a = new Add();
	    a.add();
	   
	}

}
