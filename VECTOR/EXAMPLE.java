package VECTOR;

import java.util.Vector;

public class EXAMPLE {
	public static void main(String[] args)
	{
		Vector <Integer> vec_list = new Vector <Integer>();
 
		for (int i = 10; i <= 15; i++)
		{
			vec_list.add(i);
		}
		System.out.println("Vector Elements :" + vec_list);
	}
}
