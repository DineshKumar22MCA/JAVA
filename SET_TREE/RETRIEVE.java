package SET_TREE;

import java.util.TreeSet;

public class RETRIEVE {
	public static void main(String args[])
	{
		TreeSet <String> col = new TreeSet <String>();
		col.add("Blue");
		col.add("Red");
		col.add("Green");
		col.add("White");
		col.add("Orange");
		col.add("Yellow");
		col.add("Pink");
		System.out.println("TreeSet Elements : " + col);
		System.out.println("Size of TreeSet : " + col.size());
	}
}
