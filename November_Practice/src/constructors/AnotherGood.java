package constructors;

public class AnotherGood 
{
	int salary;

	public AnotherGood(int sal)
	{
		salary = sal;
		System.out.println("Sal = " + sal);
		System.out.println("Salary = " + salary);
	}
	
	void show()
	{
		System.out.println("Salary = " + salary);
		//System.out.println("Sal = " + sal);
	}
	
	public static void main(String[] args)
	{
		AnotherGood obj1 = new AnotherGood(5);
		obj1.show();
		// TODO Auto-generated method stub

	}

}
