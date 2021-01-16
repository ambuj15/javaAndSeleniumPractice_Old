package collection_arrayList;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class FirstProgram {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ambuj");
		al.add("Goyal");
		
		//Now for traversing we have to use 3 ways, foreach loop or iterator,normal for loop.
		
		for(int i = 0;i<al.size();i++)
		{
			System.out.print("Printing using normal for loop /n"+al.get(i));
		}
		System.out.println();
		
		java.util.Iterator<String> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.print("Printing using iterator /n"+it.next());
		}
		System.out.println();
		
		// Using for each loop
		for(String s : al)
		{
			System.out.print("Printing using foreach loop "+s);
		}
		

	}

}
