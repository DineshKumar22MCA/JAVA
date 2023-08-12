package INNER_CLASS;

//Anonymous Inner Class

abstract class testDemo {
  abstract void display();
}

class outerDemo {
  public void outerDisplay() {
      testDemo o =new testDemo() {
          @Override
          public void display() {
              System.out.println("Test Display");
          }
      };
      o.display();
  }
}


public class anonymous {
  public static void main(String[] args) {
      outerDemo o =new outerDemo();
      o.outerDisplay();
  }
}