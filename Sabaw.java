import java.util.Scanner;
import java.util.PriorityQueue;

public class Sabaw
{
	 public static void main (String [] args)
	{
       		 PriorityQueue <String> nicknames = new PriorityQueue<String>();
        		Scanner sc = new Scanner(System.in);
        		System.out.println("Enter the nicknames of 4  of your classmates:");
		String nickname ;
		for(int i=0;i<4;i++)
		{
        			nickname= sc.nextLine();
        			nicknames.add(nickname);
		}
		String chars;
		
        		System.out.println("Press H to say Hi to each of them.");
     		do
		{

			chars= sc.nextLine();
			if (chars.equalsIgnoreCase("h") && nicknames.peek()!=null)
                    			System.out.println("Hi " + nicknames.poll());
			else
				break;
			
		}while(chars.equalsIgnoreCase("h"));
           		
       		 System.out.println("Done saying Hi");  
                   
	}
}

