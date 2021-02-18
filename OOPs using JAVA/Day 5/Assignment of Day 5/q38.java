// Write a Java program to print the following pattern.
//   1
//  212
// 32123
//4321234

import java.util.*;
// Author : Abhishek Sharma
public class q38
{            
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
        {
            int n = 4;   
            for (int j = 1; j<= n - i; j++) 
            { 
                System.out.print(" "); 
            } 
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) 
            { 
                System.out.print(l); 
            }   
            System.out.println(); 
        }        
    }
}


// Output :
//    1
//   212
//  32123
// 4321234
