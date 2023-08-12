package IF_STATEMENT;
import java.util.*;
public class nested_if {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = scan.nextInt();
		boolean id = false;
		
		if (age>=18) {
			if(id) {
				System.out.println("you can vote");
			}else {
				System.out.println("apply for id");
			}
		}

		else {
			System.out.println("you cANT VOTE");
		}
	}
}
