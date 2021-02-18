// Write a Java program to print the following pattern.
// 1
// 2 3 4
// 5 6 7 8 9


import java.util.*;
// Author : Abhishek Sharma
public class q37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value : "); 
        int n =sc.nextInt();
        int number  = 1;
        for(int i = 1; i <= n+2; i = i+2) {
            for(int j = 1; j <= i; j++) {
              System.out.print(number + " ");
              ++number;
            }     
            System.out.println();
          }
    }   
}




// Output :
// enter the value : 3
// 1
// 2 3 4
// 5 6 7 8 9 
