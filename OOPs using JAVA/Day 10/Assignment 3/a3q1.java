// Write a Java program to calculate Sum & Average of an integer array.

import java.util.*;
// Author : Abhishek Sharma
public class a3q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int s = 0;
        int[] array = new int[100];
        System.out.println("Enter the elements of the array :");
        for (int i=0; i<n;i++){
            array[i] = sc.nextInt();
            s = s + array[i];
        }
        float avg = s/n;
        System.out.println("Sum of the elements : "+ s);
        System.out.println("Average of the elements : "+ avg);
    }
}

// Output :
// Enter the number of elements : 5
// Enter the elements of the array :
// 2
// 3
// 5
// 4
// 6
// Sum of the elements : 20
// Average of the elements : 4.0
