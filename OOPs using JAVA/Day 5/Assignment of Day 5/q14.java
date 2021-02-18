// Write a Java program to check whether a number is divisible by 5 or not.


import java.util.*;
// Author : Abhishek Sharma
public class q14 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num%5 == 0){
            System.out.println(num + " is divisible by 5!");
        }
        else {
            System.out.println(num + " is not divisible by 5 :(");
        }
    }
}



// Output :
// Enter the number : 21
// 21 is not divisible by 5 :(
