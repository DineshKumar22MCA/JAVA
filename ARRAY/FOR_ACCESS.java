package ARRAY;

public class FOR_ACCESS {

	public static void main(String[] args) {
		 int a[]={10,20,30,40,50,60,70,80,90,100};
		 
		 for(int i=0;i<a.length;i++) {
			 
			 System.out.println(a[i]);
		 }
		 
		 
		 System.out.println();
		 
		 for(int e : a) {
			 System.out.println(e);
		 }

	}

}
