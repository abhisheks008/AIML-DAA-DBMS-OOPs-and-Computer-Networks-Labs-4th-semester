// Write a Java program to subtract two matrices.


import java.util.Scanner;
// Author : Abhishek Sharma
public class a3q20
{
   public static void main(String args[])
   {
       int i, j;
       System.out.print("Enter the roes and columns of matrices : ");
       Scanner scan = new Scanner(System.in);
       i = scan.nextInt();
       j = scan.nextInt();
       int mat1[][] = new int[i][j];
       int mat2[][] = new int[i][j];
       int mat3[][] = new int[i][j];       
       System.out.print("Enter Matrix 1 Elements : ");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat1[i][j] = scan.nextInt();
           }
       }       
       System.out.print("Enter Matrix 2 Elements : ");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat2[i][j] = scan.nextInt();
           }
       }       
       System.out.print("Subtracting Matrices (i.e. Matrix1 - Matrix2)...\n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat3[i][j] = mat1[i][j] - mat2[i][j];
           }
       }       
       System.out.print("Result of Matrix1 - Matrix2 is :\n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               System.out.print(mat3[i][j]+ " ");
           }
           System.out.println();
       }
   }
}


/*
Output :
Enter the roes and columns of matrices : 3 3
Enter Matrix 1 Elements : 9 9 9
6 6 6
3 3 3
Enter Matrix 2 Elements : 6 6 6
3 3 3
0 0 0
Subtracting Matrices (i.e. Matrix1 - Matrix2)...
Result of Matrix1 - Matrix2 is :
3 3 3
3 3 3
3 3 3
*/
