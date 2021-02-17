// Write a Java program to swap two numbers.

import java.util.*;

public class q10 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the 1st number (A) : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number (B) : ");
        int b = sc.nextInt();
        System.out.println ("A is "+a+" and B is "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println ("A is "+a+" and B is "+b);
    }
}
