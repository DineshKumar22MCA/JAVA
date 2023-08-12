package METHODS;

public class recursion_function {

	 public  int factorial(int n)//5!  =1*2*3*4*5=120
	    {
	        if(n==1)
	            return 1;
	        else
	            return (n*factorial(n-1));
	    }
	 
	public static void main(String[] args) {

		recursion_function o = new recursion_function();
		
		System.out.println(o.factorial(5));
	}

}
