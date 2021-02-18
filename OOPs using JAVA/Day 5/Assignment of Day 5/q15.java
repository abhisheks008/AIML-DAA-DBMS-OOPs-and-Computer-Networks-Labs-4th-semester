// Write a Java program to check whether a number is buzz or not.


import java.util.*;
// Author : Abhishek Sharma
public class q15 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num%10 == 0 || num%7 == 0){
            System.out.println(num + " is a buzz number");
        }
        else {
            System.out.println(num + " is not a buzz number");
        }
    }
}



// Output :
// Enter the number : 63
// 63 is a buzz number
