// Write a Java program where elements of two integer arrays get added index wise and get stored into a third array.
import java.util.*;
// Author : Abhishek Sharma
class a3q18{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. of elements of the 1st Array : ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[100];
        System.out.println("Enter the elements : ");
        for (int i = 0; i< n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the no. of elements of the 2nd Array : ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[100];
        System.out.println("Enter the elements : ");
        for (int i = 0; i< n2;i++){
            arr2[i] = sc.nextInt();
        }
        int[] result = new int[100];
        for (int i = 0; i<n1;i++){
            result[i] = arr1[i]+arr2[i];
        }
        System.out.print("The resultant array : ");
        for (int i = 0; i<n1;i++){
            System.out.print(result[i]);
            System.out.print(" ");
        }
    }
}


/*
Output :
Enter the no. of elements of the 1st Array : 3
Enter the elements :
1
2
3
Enter the no. of elements of the 2nd Array : 3
Enter the elements :
1
2
3
The resultant array : 2 4 6
*/
