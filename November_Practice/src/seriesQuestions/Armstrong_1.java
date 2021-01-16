package seriesQuestions;

public class Armstrong_1 {

	public static void main(String[] args) 
	{
		int n = 152, sum =0;
		int z =n;
		
		
		while(n>0)
		{
			int l = n%10;
			sum = sum +(l*l*l);
			n=n/10;
		}
		if(sum==z){
			System.out.println(z + " is Armstrong");
		}

		else
		{
			System.out.println(z+ " is not Armstrong");
		}
	}

}
