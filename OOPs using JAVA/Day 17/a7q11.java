//Q11. Write a Java Program to Compare Performance of Two Strings

import java.util.*;
//Author : Abhishek Sharma
public class q11 {
    public static void main(String[] args) {      
        long startTime = System.currentTimeMillis();
       
        for(int i = 0; i < 50000; i++) {
            String s1 = "hello";
            String s2 = "hello"; 
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for creation" + " of String literals : "+ (endTime - startTime) + " milli seconds" );       
        long startTime1 = System.currentTimeMillis();       
        for(int i = 0; i < 50000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for creation" + " of String objects : " + (endTime1 - startTime1)+ " milli seconds");
    }
 }

/*
Output :
Time taken for creation of String literals : 2 milli seconds
Time taken for creation of String objects : 4 milli seconds

*/
