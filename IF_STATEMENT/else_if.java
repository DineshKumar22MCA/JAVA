package IF_STATEMENT;
import java.util.*;
public class else_if {
	public static void main (String args []) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the age : ");
		int age = scan.nextInt();
		
		if (age>18) {
			System.out.println("you can vote");
		}
		else if (age>=18) {
			System.out.println("you can also vote");
		}
		else {
			System.out.println("you cANT VOTE");
		}
	}
}
