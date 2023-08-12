package SET_HASH;

import java.util.HashSet;

public class CREATE {
	public static void main(String[] args)
	{
		HashSet<String> col_set = new HashSet<String>();
		col_set.add("Red");
		col_set.add("Blue");
		col_set.add("Green");
		col_set.add("Pink");
		col_set.add("Black");
		col_set.add("Orange");
		col_set.add("White");
		System.out.println("Given HashSet : "+ col_set);		 
		col_set.clear();
		System.out.println("Removes all the Elements in HashSet : "+col_set);
	}
}
