class A
{  
	A()
	{
		this(23);  
		System.out.println("hello a");
	}  
	A(int x)
	{  

		System.out.println(x);  
	}  
  
}  
class TestThis4
{  
	public static void main(String args[])
	{  
		A a=new A();  

	}
}  
