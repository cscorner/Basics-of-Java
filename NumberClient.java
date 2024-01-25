import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class NumberClient {

    public static void main(String[] args) {
     try
     {
         Socket s=new Socket("127.0.0.1",7890);//localhost
         //user input
         Scanner sc1=new Scanner(System.in);
         System.out.println("Enter any number");
         String str=sc1.nextLine();
         
         //for sending data to client
         PrintStream ps=new PrintStream(s.getOutputStream());//send or write
         ps.print(str);
         
         Scanner sc2=new Scanner(s.getInputStream());//read
         String  msg=sc2.nextLine();
         System.out.println(msg);
         s.close();
     }     
     catch(Exception e)
     {
         System.out.println(e);
     }
    }
}
