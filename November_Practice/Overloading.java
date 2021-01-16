public abstract class  Overloading
{
public  absatract void add();

public absatract void add(int a);
}

class Overloaded extends Overloading
{

public void add()
{
int a = 10, b = 10 ,c = 0 ;

c= a+b;

System.out.println("Sum = " + c);
}
public static void main(String args[])
{
Overloaded a = new Overloaded();
a.add();
}
}
