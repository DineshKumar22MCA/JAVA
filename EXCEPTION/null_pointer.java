package EXCEPTION;

public class null_pointer {
	public static void main(String args[])
	{
	try
	{
	String name=null;
	System.out.println(name.toString());
	}
	catch(NullPointerException e) {
		System.err.println("nothing to inside");
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	
	System.out.println("rest of code");
	
	}

}
