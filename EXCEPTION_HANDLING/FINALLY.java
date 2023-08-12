package EXCEPTION_HANDLING;

public class FINALLY {

		public static void main (String [] args) {
			
			try {
				int a = 10/0;
			}
			catch(ArithmeticException e) {
				System.err.println("cant divided by zero");
			}
			catch(NullPointerException e){
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("display whatever happend");
			
			System.out.println("rest of code");
		}
	}

}
