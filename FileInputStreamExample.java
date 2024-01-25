import java.io.FileInputStream;   
import java.util.Scanner;
public class FileInputStreamExample 
{   
	public static void main(String args[])
	{     
	 	try
		{
              			FileInputStream fin=new FileInputStream("e:\\hello.txt"); 
			int i=0; 
			System.out.println("Available bytes:"+fin.available());     while(fin.available()!=0)
			{
			     i=fin.read();
           			System.out.print((char)i);     
        		}   
			
			fin.close();     
			System.out.println("success...");   
			 
          		}
		catch(Exception e)
		{
			System.out.println(e);
		}     
      }     
}  
