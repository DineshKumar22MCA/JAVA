package MAP_TREE;

import java.util.*;

public class DUPLICATE {
	public static void main(String args[])
	{  
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();  
		hash_map.put(1, "Blue");
		hash_map.put(2, "Green");
		hash_map.put(3, "Pink");
		hash_map.put(4, "White");
		hash_map.put(5, "Red");
		hash_map.put(6, "Black");
		hash_map.put(7, "Orange");
 
		// Checking collection
		System.out.println("Collection View is : "+ hash_map.values());
	}
}

