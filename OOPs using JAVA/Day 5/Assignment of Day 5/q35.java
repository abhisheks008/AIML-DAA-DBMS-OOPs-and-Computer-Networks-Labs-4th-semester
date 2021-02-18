// Write a Java program to print prime numbers between a given range.


import java.util.*;
// Author : Abhishek Sharma
public class q35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of lower bound : "); 
        int a =sc.nextInt();
        System.out.print("enter the value of upper bound : "); 
        int b =sc.nextInt();
        int i, j, flag;
        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1; 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + " ");
        }       
    }   
}



// Output :
// enter the value of lower bound : 45
// enter the value of upper bound : 59

// Prime numbers between 45 and 59 are: 47 53 59
