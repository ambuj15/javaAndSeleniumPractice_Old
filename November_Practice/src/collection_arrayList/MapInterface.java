package collection_arrayList;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static <V> void main(String[] args) 
	{
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(101,"Goyal");
		m.put(101,"Ambuj");
		m.put(102,"Goyal");
		
		
		for(Map.Entry<Integer, String> loop : m.entrySet())
		{
			System.out.println(loop.getKey() + " "+ loop.getValue());
		}

	}

}
