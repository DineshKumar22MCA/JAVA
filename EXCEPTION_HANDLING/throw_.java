package EXCEPTION_HANDLING;
class users{
	
	public void username(String str)throws Exception
	{
		if(str.length()<3)
				throw new Exception("name sort");
		else
			System.out.println(str);
}
}
public class throw_ {
public static void main (String args[]) throws Throwable{
	
	users u=new users();
	u.username("virat");
	u.username("a");
	System.out.println("end");

}
}