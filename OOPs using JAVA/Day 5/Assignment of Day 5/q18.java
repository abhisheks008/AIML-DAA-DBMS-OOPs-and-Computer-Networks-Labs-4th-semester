// Write a Java program to reverse a number.


import java.util.*;
// Author : Abhishek Sharma
public class q18 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :");
        int x = sc.nextInt();
        int old = x;
        int r, sum=0;
        while (x>0){
            r = x%10;
            x = x/10;
            sum = sum*10 + r;
        }


        System.out.println("Given number was " + old);
        System.out.println("Reversed number is " + sum);
    }
}



// Output :
// Enter the number :4587
// Given number was 4587
// Reversed number is 7854
