package constructors;

public class CallConstructor 
{
    int salary = 1000;

	public CallConstructor(int sal)
	{
		salary = sal;
		System.out.println("Sal = " + sal);
		System.out.println("Salary = " + salary);
	}
	
	void show()
	{
		System.out.println("Salary = " + salary);
		//System.out.println("Sal = " + sal); -- Will give error because it's scope will be limited to costructor only.
	}
	
//To check whether default constructor can be called automatically if there is already a parameterized constructor present?
	public static void main(String[] args) 
	{

		CallConstructor obj1 = new CallConstructor(5);
		obj1.show();
		// CallConstructor obj2 = new CallConstructor(); --  This will give error because JVM will not give default constructor if we have created any constructor explicitly, to run this we need to make one non - parameterized constructor.
		//obj2.show();

	}

}
