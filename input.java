import java.lang.*;
import java.util.*;
interface Name {  
   public void user_name();
}
interface Choice extends Name{ 
    public void choice_by_user();
}

interface nextStep extends Choice{ 
    public void next_Step();
}

public class input implements nextStep {  
  
   public void user_name() {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your name: ");
   
      String name=sc.next();
      System.out.println("Press 1 or 2 to select your game mode.\n1-Story\n2-Survival\n");
    
     
      System.out.println("Press P to start Playing "+name);
     
      char c = sc.next().charAt(0);
      if(c=='P') System.out.println("YOUR INPUT IS "+c);
    
     
   }
   
   public void choice_by_user() {
    
      System.out.println("Thanks for input.");
      System.out.println("The game is starting.....");
      for(int i=0;i<5;i++)
      System.out.println(".....");
   }
   
   public void next_Step() {
       
      System.out.println("\nNow We will go the game scene");
      System.out.println("The game will start at the easy level \nand \nthen will move to higher level of difficulty.");
      }
   
   public static void main(String args[]) {
    input obj = new input(); 
    obj.user_name(); 
    obj.choice_by_user(); 
    obj.next_Step(); 
   }
   
}