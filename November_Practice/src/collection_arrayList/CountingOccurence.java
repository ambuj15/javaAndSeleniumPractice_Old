package collection_arrayList;

import java.util.HashMap;

public class CountingOccurence {

	public static void main(String[] args)
	
	{
		int a[] = {1,2,3,4,1,2,5,2};
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i :a)
		{
			if(m.containsKey(i))
			{
				int count = m.get(i);
				m.put(i, ++count);
			}
			else
			{
				m.put(i, 1);
			}
		}
		
		for(int k : m.keySet())
		{
			System.out.println(k + " is occuring = " + m.get(k) + " times");
		}

	}

}
