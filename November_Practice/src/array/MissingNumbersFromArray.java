package array;
//In this program there is an error that in case we have entered number 1,2,4,7 then in that case due to unavailability of dynamic array it is throwing exception.

public class MissingNumbersFromArray {
	

	public static void main(String[] args) 
	{
		int a[] = {1,10,14,24};
		for(int i =0;i<a.length-1;i++)
		{
			int n = a[i+1] -a[i];
						{
						for(int j =1;j<n;j++)
						{
							System.out.println(++a[i]);
						}
				
					}
		}
		
}
}