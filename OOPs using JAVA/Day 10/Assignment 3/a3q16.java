// Write a Java program which counts the non-zero elements in an integer array.


import java.util.*;
// Author : Abhishek Sharma
class a3q16{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. of elements : ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Enter the elements : ");
        int [] arr = new int[100];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if (arr[i]!=0){
                count++;
            }
        }
        System.out.println("No. of non-zero elements  : " + count);

    }
}

/*
Output :
Enter the no. of elements : 5
Enter the elements :
1
0
0
3
0
No. of non-zero elements  : 2
*/
