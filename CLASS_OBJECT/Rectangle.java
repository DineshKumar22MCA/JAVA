package CLASS_OBJECT;

public class Rectangle {

    int length, width;
 
    void getDetails(int x, int y) {
        length = x;
        width = y;
    }
    int area() {
        int a = length * width;
        return a;
    }
}
