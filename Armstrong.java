import java.util.*;
class Armstrong
{

      public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print('Enter no.");
      int num = sc.nextInt();
      int n = num; 
      int check=0,remainder;
      while(num > 0)
{
           remainder = num % 10;
           check = check + (int)Math.pow(remainder,3);
           num = num / 10;
      }
      if(check == n)
            System.out.println(n+" is an Armstrong Number");
      else
            System.out.println(n+" is not a Armstrong Number");
   }
}
