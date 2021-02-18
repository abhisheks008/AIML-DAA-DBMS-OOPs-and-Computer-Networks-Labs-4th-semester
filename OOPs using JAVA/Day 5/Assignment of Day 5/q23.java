// Write a Java program to generate multiplication table.


import java.util.*;
// Author : Abhishek Sharma
public class q23 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int num = sc.nextInt();
       System.out.format("\n------Multiplication Table of %d------\n",num);
       
	for (int i=1; i<=10; i++){
           int c = num*i;
            System.out.format("%d x %d = %d\n", num, i, c);
       }
       
    }
  }



// Output :
// Enter the number : 5

// ------Multiplication Table of 5------
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// 5 x 6 = 30
// 5 x 7 = 35
// 5 x 8 = 40
// 5 x 9 = 45
// 5 x 10 = 50
