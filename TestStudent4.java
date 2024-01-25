class TestStudent4
{  	  
 	public static void main(String args[])
	{  
  		Student s1=new Student();
		Student s2;
		s2=new Student();  
		s1.createData(101,"You");  
		s2.createData(102,"Me");  
		s2.displayData();	
		s1.displayData();
	
 	}  
}  
class Student
{  
 	int rollno;
 	String name; 
	void displayData()
	{
		System.out.println(rollno+" "+name);
	}  
	void createData(int r, String n)
	{  
		  rollno=r;  
		  name=n;  
	} 
	
}