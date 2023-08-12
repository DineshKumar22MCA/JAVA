package METHODS;

public class methods_2 {

	 //with parameter without return
	
    public void sub(int x, int y) {
        System.out.println("Subtraction : " + (x - y));
    }
    
	public static void main(String[] args) {

		methods_2 o = new methods_2();
		
		o.sub(50,25);
	}

}
