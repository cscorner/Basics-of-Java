import java.util.Scanner;
public class MenuDriven
 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do 
		{
			System.out.println("Help on: ");
			System.out.println(" 1.even or odd");
			System.out.println(" 2. Max of 2 nos.");
			System.out.println("Choose one:");
			choice = sc.nextInt();
			switch(choice)
		 	{
				case 1:
					System.out.println("\nEven or ODD");		
					break;
				case 2:
					System.out.println("\nMax of nos.");		
					break;
				default:
					System.out.println("\nNo such choice!!!");		
			}
		} while( choice ==1 || choice ==2);
		System.out.println("\n");
		
	}
}