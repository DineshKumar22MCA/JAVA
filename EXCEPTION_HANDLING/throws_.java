package EXCEPTION_HANDLING;
class user{
	
	public void username(String str)throws Exception
	{
		if(str.length()<3)
				throw new Exception("name sort");
		else
			System.out.println(str);
}
}


public class throws_ {

	public static void main (String [] args) {
		
		try
		{
		user u=new user();
		u.username("virat");
		u.username("a");
		}
		catch(Exception ex)
		{
		System.out.println(ex);
		}
		System.out.println("end");

	}
}
