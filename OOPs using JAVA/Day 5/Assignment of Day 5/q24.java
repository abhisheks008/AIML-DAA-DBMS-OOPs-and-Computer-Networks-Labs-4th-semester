// Write a Java program to find HCF of two numbers.


import java.util.*;
// Author : Abhishek Sharma
public class q24 {
    public static void main(String[] args) {
        int a, b, i, hcf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
  
        for(i = 1; i <= a || i <= b; i++) {
           if( a%i == 0 && b%i == 0 )
           hcf = i;
        }
        System.out.println("HCF of given two numbers is ::"+hcf);
    }
  }



// Output :
// Enter first number : 48
// Enter second number : 16
// HCF of given two numbers is :: 16
