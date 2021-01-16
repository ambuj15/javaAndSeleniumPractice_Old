package functions;

public class Constructor 
{
	private int customerID,phoneNumber;

	public Constructor()
	{
		customerID = 1;
		phoneNumber = 954;
		
		System.out.println("Welcome to constructors");
	}
	public Constructor(int customerID,int phoneNmber)
	{
		//this.customerID = customerID;
		//this.phoneNumber = phoneNumber;
		customerID = customerID;
		phoneNumber = phoneNumber;
		
	}
	
	public void dispaly()
	{
		System.out.println(customerID +" and "+ phoneNumber);
	}
	public static void main(String[] args) 
	{
		//Constructor c = new Constructor();
		Constructor c1 = new Constructor(20,121);
		Constructor c2 = new Constructor(30,141);
		//c.dispaly();
		c1.dispaly();
		//c.customerID=2;
		//c.dispaly();

	}

}
