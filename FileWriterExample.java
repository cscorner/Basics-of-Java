import java.io.FileWriter;   
import java.util.Scanner;
public class FileWriterExample 
{   
	public static void main(String args[])
	{     
	 	try
		{
              		FileWriter fout=new FileWriter("e:\\testout2.txt"); 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter something:");     			    
			String s=sc.nextLine();     
			

			fout.write(s);     
			fout.close();     
			System.out.println("File Created successfully...");     
          		}
		catch(Exception e)
		{
			System.out.println(e);
		}     
      }     
}  
