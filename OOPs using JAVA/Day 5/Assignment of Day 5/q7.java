// Write a Java program to check whether a number is odd or even

import java.util.*;
public class q7 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n%2 == 0){
            System.out.println(n + " is an even number");
        }
        else {
            System.out.println(n + " is an odd number");
        }
    }
}
