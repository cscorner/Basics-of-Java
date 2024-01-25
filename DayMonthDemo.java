import java.util.*;
class DayMonthDemo
{

      	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter no. of days?");

      		int num = sc.nextInt()
      		int days = num%30;

      		int month = num/30;

      		System.out.println(num+" days = "+month+" Month and "+days+" days");

  	 }

}
