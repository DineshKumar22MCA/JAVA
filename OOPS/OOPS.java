package OOPS;

public class OOPS {
	
	int a = 10 ;
	
	public void fun()
	{
		System.out.println("fun-1");
	}

	public static void main(String[] args) {

		OOPS o = new OOPS();
		
		System.out.println(o.a);
		o.fun();
		
		o.a = 20;
		System.out.println(o.a);
		
		OOPS o1 = new OOPS();
		System.out.println(o1.a);
		
		o1.fun();
		
	}

}
