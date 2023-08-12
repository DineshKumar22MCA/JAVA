package STATIC;

import java.util.Arrays;
import java.util.Scanner;

public class static_member_function {

	  public static int power(int base, int power) {
	        int result = 1;
	        for (int i = 1; i <= power; i++) {
	            result *= base;
	        }
	        return result;
	    }
	



public class staticExample {
	    //Static Member Function in Java
	    public static void main(String args[]) {
	        System.out.println("Power : " + static_member_function.power(2, 3));
	    }
}
}