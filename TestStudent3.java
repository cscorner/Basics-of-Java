class Student
{  
 	int rollno;
 	String name; 
} 
class TestStudent3
{  	  
 	public static void main(String args[])
	{  
  		Student s1=new Student();
		Student s2=new Student();  
		s1.rollno=101;  
	  	s1.name="B.Sc.";  
		s2.rollno=102;  
	  	s2.name="SYCS";  
	System.out.println(s1.rollno+"\n"+s1.name);
	System.out.println(s2.rollno+"\n"+s2.name);
 	}  
}  
