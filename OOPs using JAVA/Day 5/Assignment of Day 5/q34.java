// Write a Java program to read two integer values m and n and check whether m is multiple of n or not.


import java.util.*;
// Author : Abhishek Sharma
public class q34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of 'm' : "); 
        int m=sc.nextInt();
        System.out.print("enter the value of 'n' : "); 
        int n=sc.nextInt();
        if (m%n == 0)
        	System.out.println("m is multiple of n");
        else
        	System.out.println("m is not a multiple of n");  
    }  
}



// Output :
// enter the value of 'm' : 15
// enter the value of 'n' : 12
// m is not a multiple of n
