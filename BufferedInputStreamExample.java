import java.io.FileInputStream;  
import java.io.BufferedInputStream; 
import java.util.Scanner;
public class BufferedInputStreamExample 
{   
	public static void main(String args[])
	{     
	 	try
		{
              			FileInputStream fin=new FileInputStream("e:\\hello.txt"); 
			BufferedInputStream bis=new BufferedInputStream(fin);
			int i=0; 
			System.out.println("Available bytes:"+fin.available());    				byte[] b=new byte[1024];
			     i=bis.read(b,1,10);
           			System.out.print(new String(b));     
        		  
			
			fin.close();     
			System.out.println("success...");   
			 
          		}
		catch(Exception e)
		{
			System.out.println(e);
		}     
      }     
}  
