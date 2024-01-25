
class TestStudent6
{  	  
 	public static void main(String args[])
	{  

  		Student s1=new Student();//calls constructor
		s1.displayData();
		Student s2;
		s2=new Student();  //calls cosnstructor
		s2.displayData();
		s2=new Student(101,"You");  	//calls parameterized constructor	
		s2.displayData();	
		
	
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
	
	Student()//no parameterized constructor
	{  
		  rollno=100;  
		  name="sycs";  
	} 
	Student(int r)// parameterized constructor
	{  
		  rollno=r;  
		 
	} 
	Student(int r, String n)// parameterized constructor
	{  
		  rollno=r;  
		  name=n;  
	} 
	
}