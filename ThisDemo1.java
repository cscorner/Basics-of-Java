class ThisDemo1
{  
 	int rollno;
 	String name; 
	float fee;

	ThisDemo1(int rollno,String name,float fee)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}
	void display ()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  

 	public static void main(String args[])
	{  
  		ThisDemo1 s1=new ThisDemo1(101,"ABC",12345);
		ThisDemo1 s2=new ThisDemo1(201,"LMN",67891);  
		s1.display();
		s2.display();
 	}  
}  
