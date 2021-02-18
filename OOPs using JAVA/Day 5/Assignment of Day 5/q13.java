// Write a Java Program for a given grading system.


import java.util.*;
// Author : Abhishek Sharma
public class q13 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();
        if (marks<40){
            System.out.println("Grade F");
        }
        else if (marks >= 40 && marks < 60){
            System.out.println("Grade E");
        }
        else if (marks >= 60 && marks < 70){
            System.out.println("Grade D");
        }
        else if (marks >= 70 && marks < 80){
            System.out.println("Grade C");
        }
        else if (marks >= 80 && marks < 90){
            System.out.println("Grade B");
        }
        else if (marks >= 90 && marks <= 100){
            System.out.println("Grade A");
        }
        else {
            System.out.println("Invalid");
        }
    }
}



// Output :
// Enter the marks : 89
// Grade B
