package FILE_HANDLING;
import java.io.*;
public class folder_delete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:\\Geetha");
		try
		{
			if(f.exists())
			{
				System.out.println(f.getParent());
				System.out.println(f.getName());
				System.out.println(f.getPath());
				System.out.println(f.canRead());
				System.out.println(f.canWrite());
				System.out.println(f.isDirectory());
				System.out.println(f.isFile());
				System.out.println("1.delete\n 2.exit");
				char ch=(char)System.in.read();
				if(ch=='1')
				{
					f.delete();
					System.out.println("folder deleted");
				}
				else
				{
					System.exit(0);
				}
			}
			else
			{
				f.mkdirs();
				System.out.println("Folder Created");
			}
			}
			catch(IOException e)
			{
				System.out.println("i/o error");
			}
			catch(Exception ex)
				{
			System.out.println(ex);
			}
		}
	}

