// Write a Java Program to calculate factorial of 12




import java.util.*;
// Author : Abhishek Sharma
public class q16 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int num = 12;
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}



// Output :
// Factorial of 12 is 479001600
