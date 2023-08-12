package LIST_LINKEDLIST;

import java.util.*;

public class UPDATE {
	public static void main(String[] args)
	{
		LinkedList<String> fru_list= new LinkedList<String>();
		fru_list.add("Watermelon");
		fru_list.add("Apple");
		fru_list.add("Cherry");
		fru_list.add("Banana");
		System.out.println("Given linked list : " + fru_list);
		fru_list.set(2, "Pineapple");
		System.out.println("Replace an Element in a linked list.");
		System.out.println("New linked list: " + fru_list);
	}
}
