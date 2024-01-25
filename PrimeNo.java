import java.util.*;
class PrimeNo
{
	public static void main(String args[])
	{
	          	Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.");
		int num = sc.nextInt();
	         	int flag=0;
		for(int i=2;i<num;i++)
		{
		             	if(num%i==0)
              			{
                 				System.out.println(num+" is not a Prime Number");
			                 flag = 1;
			                 break;
              			}
         		}
         		if(flag==0)
             			System.out.println(num+" is a Prime Number");
    }
}
