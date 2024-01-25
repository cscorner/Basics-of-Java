import java.io.FileOutputStream;   
import java.util.Scanner;
public class FileOutputStreamExample 
{   
	public static void main(String args[])
	{     
	 	try
		{
              		FileOutputStream fout=new FileOutputStream("e:\\testout.txt"); 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter something:");     			    
			String s=sc.nextLine();     
			byte b[]=s.getBytes();

			fout.write(b);     
			fout.close();     
			System.out.println("File Created successfully...");     
          		}
		catch(Exception e)
		{
			System.out.println(e);
		}     
      }     
}  
