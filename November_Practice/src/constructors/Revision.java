package constructors;

public abstract class Revision {
	
	public Revision()
	{
		System.out.println("Default constructor is created for Revision class");
	}
	
	public Revision(int a)
	{
		System.out.println("Overloaded constructor of revision class");
	}
	
	public abstract void show();


}
