import java.io.IOException;   
class Testthrows1
{
   

void n()throws IOException
{   
  	int i=1/0;
 }   

	 public static void main(String args[])   
	{
  		Testthrows1 obj=new Testthrows1();   
		try
		{
			obj.n();
		 }
		catch(Exception e)
		{
			System.out.println("n");   
			//e.printStackTrace();
			e.getMessage();
		}
  		System.out.println("normal flow...");   
 	 }   
}
