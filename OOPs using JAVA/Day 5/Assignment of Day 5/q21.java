// Write a Java program to find the sum of the natural numbers in a user given range.


import java.util.*;
// Author : Abhishek Sharma
public class q21 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the range of the values : ");
       int num = sc.nextInt();
       int sum = num * (num+1);
       System.out.format("The Sum of the natural numbers upto %d is %d\n", num, sum);
       
    }
  }



// Output :
// Enter the range of the values : 10
// The Sum of the natural numbers upto 10 is 110
