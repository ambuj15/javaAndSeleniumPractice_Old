package exceptionHandling;

public class TryAndCatch
{

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		try {
		a[5] = 10/0;
		}
		//1 O/p : Arithmetic exception caught
		catch(ArithmeticException e) {System.out.println("Arithmetic exception cught");}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println("Array index exception");}
		catch(Exception e) {System.out.println("Generic exception");}
		
		//2 : O/p : Arithmetic exception caught
		//catch(ArrayIndexOutOfBoundsException e) {System.out.println("Array index exception");}
		//catch(ArithmeticException e) {System.out.println("Arithmetic exception cught");}
		//catch(Exception e) {System.out.println("Generic exception");}
		
		//3 : O/p : Compilation error - ureacheble catch block of Array index out of bound exception
		//catch(Exception e) {System.out.println("Generic exception");}
		//catch(ArrayIndexOutOfBoundsException e) {System.out.println("Array index exception");}
		//catch(ArithmeticException e) {System.out.println("Arithmetic exception cught");}
		}
}
