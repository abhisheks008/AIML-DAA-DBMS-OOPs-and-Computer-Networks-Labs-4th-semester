// Write a Java program to find the exponential of a number.


import java.util.*;
// Author : Abhishek Sharma
public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the exponent : ");
        int exp = sc.nextInt();
        int e = exp;
        long result = 1;

        while (exp != 0)
        {
            result *= num;
            --exp;
        }

        System.out.printf("\nAnswer : %d to the power %d is %d\n", num, e, result);
    }
}



// Output :
// Enter the number : 3
// Enter the exponent : 4

// Answer : 3 to the power 4 is 81
