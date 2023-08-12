package INNER_CLASS;

//Local Inner Class

class Outercls
{
  void display()
  {
      class Inner
      {
          void innerDisplay()
          {
              System.out.println("Inner Display");
          }
      }

      Inner i =new Inner();
      i.innerDisplay();
  }
}

public class local {
  public static void main(String[] args) {
      Outercls o =new Outercls();
      o.display();
  }
}

