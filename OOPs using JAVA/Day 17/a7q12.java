// Q12. Write a Java Program to Use Equals Method In a String Class.

import java.util.*;
//Author : Abhishek Sharma
public class q12{  
    public static void main(String args[]){  
        String s1="Abhishek";  
        String s2="Abhishek";  
        String s3="AbhiShek";  
        String s4="ABHISHEK";  
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}

/*
Output :
true
false
false
*/
