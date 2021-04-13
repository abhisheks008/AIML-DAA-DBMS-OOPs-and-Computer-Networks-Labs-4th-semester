// Q14. Write a Java Program to Use compareTo Method In a String Class.

import java.util.*;
//Author : Abhishek Sharma
public class q14{  
    public static void main(String args[]){  
        String s1="hello";  
        String s2="hello";  
        String s3="meklo";  
        String s4="hemlo";  
        String s5="flag";  
        System.out.println(s1.compareTo(s2)); 
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
    }
}
/*
Output :
0
-5
-1
2
*/
