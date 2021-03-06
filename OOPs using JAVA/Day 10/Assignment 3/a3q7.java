// Write a Java program to find the sum of even numbers in an integer array.

import java.util.Scanner;
// Author : Abhishek Sharma
public class a3q7 {
    private static Scanner sc;
    public static void main(String[] args) 
    {
        int Size, i, EvenSum = 0;
        sc = new Scanner(System.in);
     
        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();    
        
        int [] a = new int[Size];
        
        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++)
        {
            a[i] = sc.nextInt();
        }   

        for(i = 0; i < Size; i++)
        {
            if(a[i] % 2 == 0)
            {
                EvenSum = EvenSum + a[i]; 
            }
        }       
        System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
    }
}  

/*
Output :
Please Enter Number of elements in an array : 5
Please Enter 5 elements of an Array  : 56
12
45
97
100

The Sum of Even Numbers in this Array = 168
*/
