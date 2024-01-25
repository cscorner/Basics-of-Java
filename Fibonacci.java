import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
	          	Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many terms you want in series:");
		int n= sc.nextInt();
		int fibo[]=new int[n];
		fibo[0]=1;
		fibo[1]=1;
		for(int i=2;i<n;i++)
		{	
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		for(int i=0;i<n;i++)
			System.out.print(fibo[i]+"\t");
	}
}

		
