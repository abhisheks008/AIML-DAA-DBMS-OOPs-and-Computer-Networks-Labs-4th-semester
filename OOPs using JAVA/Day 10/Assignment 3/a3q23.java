// Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write a Java program to merge them into single sorted array C that contains every item from arrays A & B, in ascending order


import java.util.*;
import java.lang.*;
import java.io.*;
// Author : Abhishek Sharma
class a3q23
{

    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                int n2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
    
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. of elements of the first array (A) : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the no. of elements of the second array (B) : ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.print("Enter the sorted elements of the first array (A) : ");
        for (int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the sorted elements of the second array (B) : ");
        for (int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n1+n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);
        System.out.print("\nArray after merging (C) in sorted manner : ");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }
}


/*
Output :
Enter the no. of elements of the first array (A) : 4
Enter the no. of elements of the second array (B) : 6
Enter the sorted elements of the first array (A) : 1 4 8 9
Enter the sorted elements of the second array (B) : 2 4 7 9 15 24

Array after merging (C) in sorted manner : 1 2 4 4 7 8 9 9 15 24
*/
