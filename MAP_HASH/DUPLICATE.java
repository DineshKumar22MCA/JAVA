package MAP_HASH;

import java.util.*;

public class DUPLICATE {
	public static void main(String args[])
	{
		HashMap<Integer,String> h =new HashMap<>();
		h.put(10,"Sam");
		h.put(11,"Sathish");
		h.put(11,"Kumar");//adding element with duplicate key
		h.put(12,"Ram"); 
		h.put(13,"Pooja");
 
		for(Map.Entry e : h.entrySet())
		{
			System.out.println("Key : "+ e.getKey());
			System.out.println("Value : "+e.getValue());
		}
	}
}
