package IF_STATEMENT;

import java.util.Scanner;

public class if_else_stmt {
	public static void main (String args[]) {
		
	    Scanner scan = new Scanner (System.in);
		
	    System.out.print("enter your age : ");
		int age = scan.nextInt();
		
		if(age>=18) {
			System.out.println("you can vote");
		}else {
			System.out.println("you cant vote");
		}
	}
}
