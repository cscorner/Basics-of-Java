//Java program to add two matrices.
 
import java.util.*;
 
public class AddMatrices
{
    public static void main(String args[])
    {
        int row,col;
         
        Scanner sc=new Scanner(System.in);
         
        //Read number of rows and cols
        System.out.print("Input number of rows: ");
        row=sc.nextInt();
        System.out.print("Input number of rows: ");
        col=sc.nextInt();
         
        //declare two dimensional array (matrices)
        int a[][]=new int[row][col];    //for matrix 1
        int b[][]=new int[row][col];    //for matrix 2
        int c[][]=new int[row][col];    //for matrix 3
         
        //Read elements of Matrix a
        System.out.println("Enter elements of matrix a:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                    a[i][j]=sc.nextInt();
            }
        }
        //Read elements of Matrix b
        System.out.println("Enter elements of matrix b:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                       b[i][j]=sc.nextInt();
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
        System.out.println("Matrix b:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.print("\n"); 
        }
         
        //adding matrices
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
         
        //print matrix b
        System.out.println(":: Final Matrix:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(c[i][j] + "\t");
            }
            System.out.print("\n"); 
        }
         
    }   
}