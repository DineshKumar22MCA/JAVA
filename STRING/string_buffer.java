package STRING;

public class string_buffer {
	 public static void main(String args[])
	    {
	        //StringBuffer & StringBuilder in Java
	 
	        StringBuilder buffer =new StringBuilder("virat");
	        System.out.println(buffer);
	        
	        buffer.append(" king");
	        System.out.println(buffer);
	        
	        buffer.insert(10," kohli");
	        System.out.println(buffer);
	        
	        buffer.replace(10,11,"   ");
	        System.out.println(buffer);
	        
	        buffer.delete(10,11);
	        System.out.println(buffer);
	        
	        buffer.reverse();
	        System.out.println(buffer);
	        System.out.println(buffer.charAt(2));
	        System.out.println(buffer.length());
	        System.out.println(buffer.substring(0));
	        System.out.println(buffer.substring(0,5));
	        buffer.setCharAt(0,'@');
	        System.out.println(buffer);
	 
	        StringBuffer sb=new StringBuffer();
	        System.out.println(sb.capacity());//default 16
	        sb.append("Hello");
	        System.out.println(sb.capacity());//now 16
	        sb.append("java is my favourite language");
	        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
	 
	    }
}
