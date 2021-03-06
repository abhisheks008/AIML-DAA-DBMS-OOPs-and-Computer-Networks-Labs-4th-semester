// Write Java program to find the sum of all odd numbers in a 2D array.


import java.util.Scanner;
// Author : Abhishek Sharma
public class a3q11 {
    private static Scanner sc;
    public static void main(String[] args) 
    {
        int OddSum = 0;
        sc = new Scanner(System.in);
     
        System.out.print(" Please Enter Number of rows in an array : ");
        int row = sc.nextInt(); 
        System.out.print(" Please Enter Number of columns in an array : ");
        int col = sc.nextInt(); 
        int [][] a = new int[row][col];
        
        System.out.print(" Please Enter elements of an Array  : ");
        for (int j=0;j<row;j++){
            for (int i = 0; i < col; i++)
            {
                a[i][j] = sc.nextInt();
                if (a[i][j] %2 != 0){
                    OddSum = OddSum + a[i][j];
                }
            }   
        }   
        System.out.println("\n The Sum of Odd Numbers in this Array = " + OddSum);
    }
}


/*
Output :
Please Enter Number of rows in an array : 2
 Please Enter Number of columns in an array : 2
 Please Enter elements of an Array  : 3
4
6
7
 The Sum of Odd Numbers in this Array = 10
*/ 
