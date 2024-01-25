import java.io.*;   

public class FileExample1 
{   
	public static void main(String args[])
	{     
	 	try
		{
              		File file = new File("E:/AY 2020-21");   
			String filenames[]=file.list();   
      			for(String f:filenames)
			{   
        				System.out.println(f);
				
			}

             			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}     
      }     
}  
