package EXCEPTION;

public class array_index {

	public static void main(String[] args) {

		try {
			int []a = {0,1,2,3};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("limit has end");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("end");

	}

}
