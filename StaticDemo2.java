class StaticDemo2
{  
	   
	public static void main(String args[])
	{  
		System.out.println("Hello main");  
	}  
	static
	{
		System.out.println("static block is invoked");
		System.exit(0);
	}
}  
