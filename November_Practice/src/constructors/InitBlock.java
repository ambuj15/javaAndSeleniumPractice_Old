package constructors;

public class InitBlock
{  

	{
		System.out.println("Hello Ambuj");
	}
	
	InitBlock()
	{
		System.out.println("How are you");
	}
	InitBlock(String s)
	{
		s = "Jai Hind";
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		InitBlock obj1 = new InitBlock();
		InitBlock obj2 = new InitBlock("Jai");
		
	}

}
