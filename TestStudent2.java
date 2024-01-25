class Student
{  
 	int rollno;
 	String name; 
} 
class TestStudent2
{  	  
 	public static void main(String args[])
	{  
  		Student s1=new Student();
		s1.rollno=101;  
	  	s1.name="SYCS";  
		System.out.println(s1.rollno+"\n"+s1.name);
 	}  
}  
