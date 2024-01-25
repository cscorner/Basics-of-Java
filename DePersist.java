import java.io.*;   
 class DePersist{   
   public static void main(String args[])throws Exception{   
      
    FileInputStream fout=new FileInputStream("f.txt");   
    ObjectInputStream out=new ObjectInputStream(fout);   
    MyStudent s=(MyStudent)out.readObject();   
System.out.println(s);   
System.out.println(s.id+" "+s.name);

    out.close();   
   System.out.println("success");   
}   
}  
