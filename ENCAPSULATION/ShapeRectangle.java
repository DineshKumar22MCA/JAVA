package ENCAPSULATION;

public class ShapeRectangle {
	private int length , width ;
	
	 //Getter Method
    int getLength() {
        return length;
    }
 
    int getWidth() {
        return width;
    }
 
    //Setter Method
    void setLength(int l) {
		if (l > 0)
            length = l;
        else
            length = 0;
    }
 
    void setWidth(int w) {
        if (w > 0)
            width = w;
        else
            width = 0;
    }
 
    int area() {
        int a = length * width;
        return a;
    }
}
