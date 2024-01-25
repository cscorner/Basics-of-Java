interface Printable
{  
	void print();  
}  
interface Showable extends Printable
{  
	void show();  
}  
class Interface5 implements Showable
{  
	public void print()
	{
		System.out.println("Hello");
	}  
	public void show()
	{
		System.out.println("Welcome");
	}    
	public static void main(String args[])
	{  
		Interface5 obj = new Interface5();  
		obj.print();  
		obj.show();  
	}  
}  
