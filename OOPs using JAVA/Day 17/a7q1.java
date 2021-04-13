// Q1. Write a Java program for calculating Factorial. Number should be taken through user input (Using Scanner)

import java.util.*;
//Author : Abhishek Sharma
class q1{  
    public static void main(String args[]){  
        int i,fact=1; 
        Scanner sc = new Scanner (System.in); 
        System.out.print("Enter the number : ");
        int number=sc.nextInt(); 
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
    }  
} 

/*
Output :
Enter the number : 5
Factorial of 5 is: 120
*/
