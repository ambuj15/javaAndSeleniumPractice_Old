package array;

public class MissingElementFromArray 
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,7}; int total = 0; int missing =0 ,n=0;
		int sum =0;
		n = a.length +1;
		for(int i =0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		total = (n)*(n+1)/2;
		missing = total-sum;
		System.out.println("Missing number = " + missing);
		
		
	}
}