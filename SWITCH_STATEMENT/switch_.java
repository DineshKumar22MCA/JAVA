package SWITCH_STATEMENT;
import java.util.*;
public class switch_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	
		System.out.println("week days");
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		
		switch(num) {
		
		case 1:
		{
			System.out.println("sunday");
			break;
		}
		case 2:
		{
			System.out.println("monday");
			break;
		}
		case 3:
		{
			System.out.println("tuesday");
			break;
		}
		case 4:
		{
			System.out.println("wednessday");
			break;
		}
		case 5:
		{
			System.out.println("thursday");
			break;
		}
		case 6:
		{
			System.out.println("friday");
			break;

		}
		case 7:
		{
			System.out.println("saturday");
			break;

		}
		default:
		{
			System.out.println("invalid selection");
			break;

		}
		}
		
		
	
	
	
	}

}
