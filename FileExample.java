import java.io.*;   

public class FileExample 
{   
	public static void main(String args[])
	{     
	 	try
		{
              		File file = new File("javaFile1234.txt");   
             		if (file.createNewFile()) 
			{   
                  			System.out.println("New File is created!");   
			} 
			else
			{   
                  			System.out.println("File already exists.");   
 
          			}
			System.out.println(file.isDirectory());
			FileOutputStream f=new FileOutputStream(file);
			f.write(78);
			File f1=new File("e:/AY 2020-21");
			f1.mkdir();
			System.out.println(f1.isDirectory());

		}
		catch(Exception e)
		{
			System.out.println(e);
		}     
      }     
}  
