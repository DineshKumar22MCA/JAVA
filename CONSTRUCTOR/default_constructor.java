package CONSTRUCTOR;

public class default_constructor {
	 int length, width;
	 
	    public default_constructor() {
	        System.out.println("Constructor Called");
	        length=2;
	        width=10;
	    }
	 
	    int area() {
	        int a = length * width;
	        return a;
	    }
	
	 
 public static void main(String args[]) {
	 default_constructor o1 = new default_constructor();
	 System.out.println("Area of Rectangle : " + o1.area());
	 
	    }
	}
