package seriesQuestions;

import java.util.Scanner;

public class RoundOff 
{

	public static int round(double n)
	{
		int rounded = (int)(n+0.5);
		return rounded;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter any decimal number for rounding off");
		Scanner sc = new Scanner(System.in);
		int result = RoundOff.round(sc.nextDouble());
		System.out.println("Rounded off number = " + result);
		sc.close();

	}

}
