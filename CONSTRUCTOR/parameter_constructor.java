package CONSTRUCTOR;

public class parameter_constructor {

	 float length,breadth;
	    public parameter_constructor(){  //Default
	        length=2;
	        breadth=5;
	    }
	    public  parameter_constructor(float x,float y) //Parameterized
	    {
	        length=x;
	        breadth=y;
	    }
	    parameter_constructor(float x)
	    {
	        length=breadth=x;
	    }
	    float area()
	    {
	        return  length*breadth;
	    }
	
	    public static void main(String args[]) {
	    	parameter_constructor o =new parameter_constructor();
	        System.out.println("Area : "+o.area() );
	 
	        parameter_constructor o1 =new parameter_constructor(3,6);
	        System.out.println("Area : "+o1.area() );
	 
	        parameter_constructor o2 =new parameter_constructor(3);
	        System.out.println("Area : "+o2.area() );
	    }
	}