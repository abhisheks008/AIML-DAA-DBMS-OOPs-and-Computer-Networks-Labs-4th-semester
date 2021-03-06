// Write a Java program to find duplicate elements in a 1D array and find their frequency of occurrence.


import java.util.*;
// Author : Abhishek Sharma
class a3q21{
public static void findCounts(int arr[], int n)
{
    int hash[] = new int[n];
    Arrays.fill(hash, 0);
    int i = 0;
    while (i < n)
    {
        hash[arr[i] - 1]++;
        i++;
    }
    System.out.println("\nDuplicate elements -> Occurrence");
    for(i = 0; i < n; i++)
    {
        if (hash[i]>1){

        
        System.out.println((i + 1) + " -> " + 
                           hash[i]);
        }
    }
}
 
public static void main(String []args)
{
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the no. of elements : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array : ");
    for (int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    findCounts(arr, n);
}
}

/*
Output :
Enter the no. of elements : 10
Enter the elements of the array :
1 5 6 4 7 7 8 5 9 9

Duplicate elements -> Occurrence
5 -> 2
7 -> 2
9 -> 2
*/
