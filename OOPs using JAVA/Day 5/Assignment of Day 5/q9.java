// Write a Java program to find the maximum of three numbers.

import java.util.*;

public class q9 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number : ");
        int c = sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println(a + " is the biggest number");
            } 
            else {
                System.out.println(c + " is the biggest number");
            }
        }
        else {
            if (b>c){
                System.out.println(b + " is the biggest number");
            }
            else {
                System.out.println(c + " is the biggest number");
            }
        }       
    }
}

