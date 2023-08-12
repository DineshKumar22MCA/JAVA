package INNER_CLASS;

//Static Inner Class
class OuterClass {
  static int x=10;
  int y=20;
  static class InnerClass
  {
      void display()
      {
          System.out.println("X : "+x);
      }
  }
}

public class Static {
  public static void main(String[] args) {
      OuterClass.InnerClass i =new OuterClass.InnerClass();
      i.display();
  }
}
