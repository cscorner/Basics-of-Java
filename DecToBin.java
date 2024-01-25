import java.util.*;  
public class DecToBin
{  
	public static void main(String args[])  
	{  
		int n, r, i=1, j;  
		int bin[] = new int[100];  
	        	Scanner sc= new Scanner(System.in);  	          		
		System.out.print("Input a Decimal Number : ");  
		n = sc.nextInt();  
	        	while(n != 0) 
	        	{  
	            		bin[i++] = n%2;  
		            	n= n/2;  
	        	}   
	        	System.out.print("Binary number is: ");  
		 for(j=i-1; j>0; j--)  
	       	 {  
		            System.out.print(bin[j]+"  ");  
	        	}  
	        	System.out.print("\n");  
	}  
}  
