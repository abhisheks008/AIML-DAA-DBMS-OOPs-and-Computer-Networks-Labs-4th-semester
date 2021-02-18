// Write a Java program to check whether a number is prime or not.


import java.util.*;
// Author : Abhishek Sharma
public class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int m = n/2;
        int flag = 0;
        if(n==0||n==1){  
            System.out.println(n+" is not prime number");      
        }
        else {  
            for(int i=2;i<=m;i++){      
                if(n%i==0){      
                    System.out.println(n+" is not prime number");      
                    flag=1;      
                    break;      
                }      
            }      
            if(flag==0)  
            { 
                System.out.println(n+" is prime number"); 
            }  
        }
    }
}



// Output :
// Enter the number :15
// 15 is not prime number
