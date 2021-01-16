package exceptionHandling;

public class NestedTry {
	
	int a = 19;
	
	public static abstract void a();

	public static void main(String[] args) 
	{
		try 
		{
			int i =10;
			{
				try {
					int x = i/(int)10.0; 
				}
				catch(ArithmeticException e) {System.out.println();}
				finally {System.out.println();}
			}
		}finally {}

	}

}
