package staticKeyword;

public class Counter 
{
	//In case of static count2 whenever object will be created it will overwrite existing value.
	int count1=0; String name = "Ambuj";
	static int count2 = 0;//will get memory when instance is created  
	  
	Counter()
	{  
	count1++;  

	count2++;
	System.out.println("Count 1 = " + count1 + " and "+ "Count 2 = " + count2);
	}  

	public static void main(String[] args) 
	{
		new Counter();
		new Counter();
		new Counter(); 

	}

}
