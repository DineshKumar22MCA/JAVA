package CLASS_OBJECT;

public class class_object {
	 public static void main(String args[]) {
	        Rectangle o1 =new Rectangle();
	        o1.length=10;
	        o1.width=20;
	        System.out.println("Area of Rectangle : "+o1.area());
	 
	 
	        Rectangle o2=new Rectangle();
	        o2.getDetails(20,30);
	        System.out.println("Area of Rectangle : "+o2.area());
	 
	    }
}