package SET_HASH;

import java.util.*;

public class ITRATE {
	public static void main(String[] args)
	{
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Blue");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("Orange");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		Iterator<String> it = h_set.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
}}