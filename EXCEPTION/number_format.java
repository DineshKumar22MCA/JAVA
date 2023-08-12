package EXCEPTION;

import java.io.DataInputStream;

public class number_format {
	public class exception2{
		public static void main(String args[])
		{
		try{
		int a;
		DataInputStream ds=new DataInputStream(System.in);
		a=Integer.parseInt(ds.readLine());
		System.out.println(a);
		}
		catch(Exception e){
		System.out.println(e);
		}
		finally{
		System.out.println("final block");
		}
		
		System.out.println("end");
		}
}
}
