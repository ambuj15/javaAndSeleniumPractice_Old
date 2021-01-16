package constructors;

public class ConstructFirstProgram
{
	int a , b;
	static int c;
	
	public ConstructFirstProgram() 
	{
		System.out.println("Initializing variable value");
		
		a= 10;
		b=20;
	}
	public ConstructFirstProgram(int a) 
	{
		System.out.println("1st parameterized constructor");
		
		a= 20;
		b=15;
		c=20;
	}
	
	public ConstructFirstProgram(int a ,int b)
	{
		System.out.println("2nd parameterized constructor");
		a= 25;b=30;c=35;
	}
	
	public ConstructFirstProgram(int a,int b,int c)
	{
		System.out.println("3rd parameterized constructor");
		a= 35;b=40;c=50;
	}
	
	
	int Add()
	{
		return(a+b+c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ConstructFirstProgram object1 = new ConstructFirstProgram();
		ConstructFirstProgram object2 = new ConstructFirstProgram(5);
		ConstructFirstProgram object3 = new ConstructFirstProgram(5,10);
		ConstructFirstProgram object4 = new ConstructFirstProgram(5,10,15);
		
		System.out.println(object1.Add());
		System.out.println(object2.Add());
		System.out.println(object3.Add());
		System.out.println(object4.Add());
		

	}

}
