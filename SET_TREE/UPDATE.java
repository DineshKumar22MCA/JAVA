package SET_TREE;

import java.util.Iterator;
import java.util.TreeSet;

public class UPDATE {
	public static void main(String args[])
	{
		TreeSet <Integer> num = new TreeSet <Integer>();
		num.add(70);
		num.add(30);
		num.add(50);
		num.add(20);
		num.add(60);
 
		Iterator <Integer> ite = num.iterator();
		System.out.println("Elements in Ascending order ..");
 
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
}
