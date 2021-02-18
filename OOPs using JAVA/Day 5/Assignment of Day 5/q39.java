// Write a Java program to print the following pattern.
// 1     1
//  2   2
//   3 3
//    4



import java.util.*;
// Author : Abhishek Sharma
public class q39
{            
    public static void main(String[] args) {
        int n=4; 
        int i, j, space, k = 0;
        int val = 1;
        for (i = n; i >= 1; i--) { 
            for (j = 0; j <= n - i; j++) { 
                System.out.print(" "); 
            } 
            k = 0; 
            while (k != (2 * i - 1)) {      
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print(val); 
                else
                    System.out.print(" "); 
                k++;         
            } 
            val++;
            System.out.println(); 
        }
    }
}




// Output :
// 1     1
//  2   2
//   3 3
//    4
