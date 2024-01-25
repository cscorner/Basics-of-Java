import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Maps{
	public static void main(String[]args)
	{
			//key 	value
			
		Map <String, String> maps = new HashMap <String, String>();
		Scanner sc = new Scanner(System.in);

		String no,name;
		for(int i=1;i<=3;i++)
		{
			System.out.print("Enter number of student "+i+":");
			no=sc.nextLine();
			System.out.print("Enter  name of student "+i+":");
			name=sc.nextLine();
			maps.put(no,name);
		
		}
		System.out.println("Student List");
		for(Map.Entry m:maps.entrySet())
		{   
    			System.out.println(m.getKey()+" "+m.getValue());   
		}
		maps.remove ("3");
		
		System.out.println("After Remove:");
   		System.out.println("--------------");
    		System.out.println("Student List");
		for(Map.Entry m:maps.entrySet())
		{   
    			System.out.println(m.getKey()+" "+m.getValue());   
		}

		System.out.print("Enter number of student: ");
		no=sc.nextLine();
		System.out.print("Enter  name of student: ");
		name=sc.nextLine();
		maps.put(no,name);

		System.out.println("After Adding:");
   		System.out.println("--------------");
    		System.out.println("Student List");
		for(Map.Entry m:maps.entrySet())
		{   
    			System.out.println(m.getKey()+" "+m.getValue());   
		}
		
	}
}
