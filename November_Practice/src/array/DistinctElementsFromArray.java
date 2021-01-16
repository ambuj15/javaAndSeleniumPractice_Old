package array;

//import java.util.Scanner;
public class DistinctElementsFromArray 
{

	public static void main(String[] args) 
	{
	 int flag =0;
	 int a[] = {1,1,4,4,3,1,4,3,3,7,8,9,10,3,3,3,3};
	 int length = a.length;
	 
	 for(int i =0;i<length;i++)
	 {
		 flag=0;
		 for(int j = i-1;j>=0;j--)
		 {
			 
			 if(a[i]==a[j])
			 {
		
				 flag =1;
				 break;
			 }
		 }
		 if(flag==0)
		 {
			 System.out.println(a[i]);
		 }
	 }
	}
}
