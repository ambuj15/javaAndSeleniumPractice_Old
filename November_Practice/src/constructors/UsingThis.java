package constructors;

public class UsingThis {
	int a , b;
	static int c;
	
	public UsingThis() 
	{
		System.out.println("Initializing variable value");
		
		this.a= 10;
		this.b=20;
	}
	
	public UsingThis(int a) 
	{
		System.out.println("1st parameterized constructor");
		
		this.a= 20;
		this.b=15;
		this.c=20;
		System.out.println("Local variable a = "+a + " and global variable a using this.a = " + this.a);
	}
	
	public UsingThis(int a ,int b)
	{
		System.out.println("2nd parameterized constructor");
		this.a= 25;
		this.b=30;
		this.c=35;
	}
	
	public UsingThis(int a,int b,int c)
	{
		System.out.println("3rd parameterized constructor");
		this.a=35;
		this.b=40;
		this.c=50;
	}
	
	
	int Add()
	{
		return(a+b+c);
	}

	public static void main(String[] args) 
	{
		UsingThis object1 = new UsingThis();
		UsingThis object2 = new UsingThis(5);
		UsingThis object3 = new UsingThis(5,10);
		UsingThis object4 = new UsingThis(5,10,15);
		
		System.out.println(object1.Add());
		System.out.println(object2.Add());
		System.out.println(object3.Add());
		System.out.println(object4.Add());
		

	}

}
