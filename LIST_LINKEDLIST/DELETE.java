package LIST_LINKEDLIST;
import java.util.*;
public class DELETE
{
	public static void main(String[] args)
	{
		LinkedList <String> fru_list = new LinkedList <String> ();
		fru_list.add("Papaya");
		fru_list.add("Mulberry");
		fru_list.add("Apple");
		fru_list.add("Banana");
		fru_list.add("Cherry");
		fru_list.add("Watermelon");
		System.out.println("Given linked list : " + fru_list);
		fru_list.remove(3);
		System.out.println("After Remove specified element : " + fru_list);
	}
}
