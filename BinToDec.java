import java.util.*;  
public class BinToDec
{  
	public static void main(String args[])  
	{  
		long bin, dec = 0, j = 1, r;  
		Scanner sc= new Scanner(System.in);  	          
		System.out.print("Input a binary number: "); 
		bin= sc.nextLong();  	        	          
	        	while(bin != 0)  
	        	{  
	            		r = bin % 10;
			dec = dec + r * j;  
			j = j * 2;  
			bin = bin / 10;  
		}   
	        	System.out.println("Decimal Number: " + dec);  
	}  
}  

