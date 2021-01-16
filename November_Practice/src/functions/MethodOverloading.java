package functions;

public class MethodOverloading 
{

	public void add()
	{
		int a = 10,b= 20;
		
		int sum = a+b;
		System.out.println("Sum1 = "+sum);
	}
	
	public void add(int a,int b)
	{
		int sum = a+b;
		System.out.println("Sum2 = "+ sum);
	}
	
	public void add(float a,float b)
	{
		float sum = a+b;
		System.out.println("Sum3 = "+ sum);
	}
	
	public void add(int a,float b)
	{
       int sum = a+(int)b;
		System.out.println("Sum4 = "+ sum);
	}
	public void add(float a,int b)
	{
		float sum = a+b;
		System.out.println("Sum5 = "+ sum);
	}
	public void add(int a,double b,float c)
	{
	    int sum = a+(int)b+(int)c;
		System.out.println("Sum6 = "+ sum);
		
	}
	public void add(int a,int b,int c)
	{
	    int sum = a+b+c;
		System.out.println("Sum7 = "+ sum);
		
	}
	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.add();
		m.add(10,20.0f);
		m.add(10l,20);
		m.add(10,10,20);
		m.add(30,40,10);
		m.add(20.0f, 30);
		m.add(10.0f,20.0f);
		
		// TODO Auto-generated method stub

	}

}
