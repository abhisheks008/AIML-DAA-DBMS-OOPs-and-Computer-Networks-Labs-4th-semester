// Write a Java program whether a number is positive or negative.

import java.util.*;
public class q8 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println(n + " is a negative number");
        }
        else {
            System.out.println(n + " is a positive number");
        }
    }
}
