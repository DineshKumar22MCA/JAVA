package QUEUE;

import java.util.*;

public class CREATE {
	public static void main(String[] args)
	{
		Queue <String> queue = new LinkedList <> ();
 
		queue.add("Yellow");
		queue.add("Green");
		queue.add("Pink");
		queue.add("Black");
		queue.add("Blue");
		queue.add("White");
		queue.add("Red");
 
		System.out.println("Queue Elements : " + queue);
	}
}
