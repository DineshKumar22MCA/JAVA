package METHODS;

import java.util.Arrays;
import java.util.Scanner;

public class returning_array {
	 public static int[] sortArray() {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter The Limit : ");
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter The Value " + i + " : ");
	            a[i] = in.nextInt();
	        }
	        Arrays.sort(a);
	        // returning  array
	        return a;
	    }
	 
	    //Returning Arrays from Method
	    public static void main(String args[]) {
	        int arr[] = sortArray();
	        for (int a : arr)
	            System.out.println(a);
	    }
	 
	 
}
