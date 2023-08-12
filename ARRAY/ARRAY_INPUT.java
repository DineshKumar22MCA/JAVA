package ARRAY;

import java.util.Scanner;

public class ARRAY_INPUT {

	public static void main(String[] args) {
        int [] c =new int[10]; //Combining Both Statement

		 for(int i=0;i<3;i++)
	        {
	            Scanner in =new Scanner(System.in);
	            System.out.println("Enter The Number");
	            c[i]=in.nextInt();
	        }
	        for(int element : c)
	        {
	            System.out.println(element);
	        }
	}

}
