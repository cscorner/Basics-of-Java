class TestStudent5
{  
 	int rollno;
 	String name; 
	static String college ="GNKC";  

	TestStudent5(int r,String n)
	{  
	   	rollno = r;  
	   	name = n;  
	}  
	void display ()
	{
		System.out.println(rollno+" "+name+" "+college);
	}  

 	public static void main(String args[])
	{  
  		TestStudent5 s1=new TestStudent5(101,"ABC");
		TestStudent5 s2=new TestStudent5(201,"LMN");  
		s1.display();
		s2.display();
 	}  
}  
