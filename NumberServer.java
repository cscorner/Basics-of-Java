import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class NumberServer {
    public static void main(String[] args) {
        try
        {
            ServerSocket ss=new ServerSocket(7890);
            Socket s=ss.accept();
            System.out.println("Server Started...");
            
            PrintStream ps=new PrintStream(s.getOutputStream());//send or write
            Scanner sc=new Scanner(s.getInputStream());//read
            String msg=sc.nextLine();
            int n=Integer.parseInt(msg);
            
            if(n>0)
                ps.print(msg+" is +ve");
            else if(n<0)
                 ps.print(msg+" is -ve");
            else
                 ps.print(msg+" is ZERO");
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
