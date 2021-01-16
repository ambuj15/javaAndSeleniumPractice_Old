package constructors;

public class Revision_Child extends Revision {
	
	public Revision_Child()
	{
	
		System.out.println("Default constructor of Revision child class");
	}
	
	public Revision_Child(int a)
	
	{
		this();
		System.out.println("Parameterized constructor of Revision child class");
	}
	
	public void show()
	{
		System.out.println("Giving body to show method of revision class");
	}

	public static void main(String[] args) {

		System.out.println("Main method of revision child class");

		Revision_Child r = new Revision_Child(10);

	}

}
