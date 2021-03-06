// Write a Java program to print every alternate number of a given array.


import java.util.*;
// Author : Abhishek Sharma
import java.io.*;
class a3q22{
static void printAlter(int[] arr, int N)
{
    for(int currIndex = 0; currIndex < N; currIndex++)
    {
        if (currIndex % 2 == 0)
        {
            System.out.print(arr[currIndex] + " ");
        }
    }
}
public static void main(String[] args)
{
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the no. of elements : ");
    int N = sc.nextInt();
    int[] arr = new int[N];
    System.out.println("Enter the elements of the array : ");
    for (int i=0; i<N; i++){
        arr[i] = sc.nextInt();
    }
    printAlter(arr, N);
}
}


/*
Output :
Enter the no. of elements : 6
Enter the elements of the array :
1 2 3 4 5 6
1 3 5
*/
