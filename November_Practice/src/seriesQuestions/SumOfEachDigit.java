package seriesQuestions;

public class SumOfEachDigit {
	
	public int sumOfDigits(int n)
	{  
		int l,sum = 0;
		while(n!= 0)
		{
			l = n%10;
			sum = sum + l;
			n= n/10;
			
			}
		return sum;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		SumOfEachDigit s = new SumOfEachDigit();
	  // int r =  s.sumOfDigits(123);
		//System.out.println("Hello " + sum);
		System.out.println(s.sumOfDigits(123));
	}

}
