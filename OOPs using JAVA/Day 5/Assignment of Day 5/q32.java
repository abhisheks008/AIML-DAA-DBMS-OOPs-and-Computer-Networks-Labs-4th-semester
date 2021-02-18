// Write a Java program to find the value of Euler's number using the formula of 1 + 1/1! + 1/2! + 1/3!...


import java.util.*;
// Author : Abhishek Sharma
public class q32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a range : "); 
        int n=sc.nextInt();
        System.out.println("The Euler number upto " + n +" terms is : " + sum(n)) ;    
        }   
        static int factorial(int n) 
        { 
            int res = 1; 
            for (int i = 2; i <= n; i++) 
            res *= i; 
            return res; 
        }        
        static double sum(int n) 
        { 
            double sum = 0; 
            for (int i = 1; i <= n; i++) 
                sum += 1.0/factorial(i); 
            return sum; 
        } 
}


// Output :
// enter a range : 5
// The Euler number upto 5 terms is : 1.7166666666666668
