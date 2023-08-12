package SET_TREE;

import java.util.*;

public class DELETE {
	public static void main(String args[])
	{
		TreeSet <String> col = new TreeSet <String>();
		col.add("Blue");
		col.add("Red");
		col.add("White");
		col.add("Orange");
		col.add("Green");
		col.add("Yellow");
		col.add("Pink");
		System.out.println("TreeSet Element : " + col);
 
		col.remove("Red");
		col.remove("Green");
		System.out.println("Updated TreeSet : " + col);
	}
}
