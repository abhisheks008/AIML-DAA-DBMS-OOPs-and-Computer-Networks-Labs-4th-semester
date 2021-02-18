// Write a Java program whether a number is Armstrong or not.


import java.util.*;
// Author : Abhishek Sharma
public class q36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value : "); 
        int n =sc.nextInt();
        int c=0,a,temp;  
        temp=n;  
        while(n>0)  
        {  
            a=n%10;  
            n=n/10;  
            c=c+(a*a*a);  
        }  
        if(temp==c)  
            System.out.println(temp + " is an Armstrong number");   
        else  
            System.out.println(temp + " is Not Armstrong number");   
       }    
}



// Output :
// enter the value : 153
// 153 is an Armstrong number
