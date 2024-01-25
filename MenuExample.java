import java.util.Scanner;

public class MenuExample 
{
    	public static void main(String[] args) 
	{
    		double n1, n2;
        		Scanner sc = new Scanner(System.in);
        		System.out.print("Enter first number:");    
        		n1 = sc.nextDouble();
       		System.out.print("Enter second number:");
        		n2 = sc.nextDouble();

        		System.out.print("Enter an op (+, -, *, /): ");
       		char op = sc.next().charAt(0);
               		double output=0;

        		switch(op)
       		{
            			case '+':
            				output = n1 + n2;
                				break;

           			case '-':
            				output = n1 - n2;
               				 break;

            			case '*':
            				output = n1 * n2;
                				break;

            			case '/':
            				output = n1 / n2;
                				break;         
            			default:
                				System.out.printf("Invalid operator");
              
        		}

        		System.out.println(n1+" "+op+" "+n2+"="+output);
   	 }
}