import java.util.*;
class HarmonicSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many series?");
      		int n = sc.nextInt();
      		double result = 0.0;
      		while(n>0)
		{
            			result = result +  1.0 / n;
            			n--;
      		}
      		System.out.println("Output of Harmonic Series is "+result);
  	}
}
