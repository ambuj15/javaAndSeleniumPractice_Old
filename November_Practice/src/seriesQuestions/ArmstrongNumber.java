package seriesQuestions;

public class ArmstrongNumber {
	
	
	public void armstrong(int n)
	{	
		int z = n, l = 0, sum = 0;
		
		while(n!=0)
		{
			l= n%10;
			sum = sum + (l*l*l);
			n= n/10;
		}
		
		System.out.println(sum);
		if(sum==z)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArmstrongNumber arm = new ArmstrongNumber();
		
		arm.armstrong(0);
			
	}

}
