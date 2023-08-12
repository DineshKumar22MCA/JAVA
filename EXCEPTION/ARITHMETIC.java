package EXCEPTION;

public class ARITHMETIC {

	public static void main (String [] args) {
		
		try {
			int a = 10/0;
		}
		catch(ArithmeticException e) {
			System.err.println("cant divided by zero");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("rest of code");
	}
}

