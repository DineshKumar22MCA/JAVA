package ENCAPSULATION;

public class get_set {
	 public static void main(String args[]) {
	        ShapeRectangle o = new ShapeRectangle();
	        o.setLength(-10);
	        o.setWidth(20);
	        System.out.println("Length : " + o.getLength());
	        System.out.println("Width  : " + o.getWidth());
	        System.out.println("Area of Rectangle : " + o.area());
	    }
}
