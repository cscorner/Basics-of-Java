import java.util.*;
 
public class TransposeMatrix
{
    public static void main(String args[])
    {
        int row,col;
         
        Scanner sc=new Scanner(System.in);
         
        //Read number of rows and cols
        System.out.print("Input number of rows: ");
        row=sc.nextInt();
        System.out.print("Input number of cols: ");
        col=sc.nextInt();
         
        //declare two dimensional array (matrices)
        int a[][]=new int[row][col];
 
         
        //Read elements of Matrix a
        System.out.println("Enter elements of matrix a:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
         
        //print matrix a
        System.out.println("Matrix a:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
         
         
        //print matrix b
        System.out.println("::: Transpose Matrix ::: ");
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(a[j][i] + "\t");
            }
            System.out.print("\n"); 
        }
         
    }   
}