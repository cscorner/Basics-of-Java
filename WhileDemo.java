public class WhileDemo 
{
	public static void main(String args[]) 
	{
		int i=1,n;
		n=Integer.parseInt(args[0]);
		while(i<=n)
		{
			if(i%2==0)
				System.out.println(i+" is EVEN");
			i++;
		}
	}
}
