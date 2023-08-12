package FILE_HANDLING;

import java.io.File;

public class folder_create {
	public static void main(String[] args) {
		File f=new File("D:\\Test");
		if(f.mkdir())
			System.out.println("dir created");
		else
			System.out.println("not created dir");
		}

}
