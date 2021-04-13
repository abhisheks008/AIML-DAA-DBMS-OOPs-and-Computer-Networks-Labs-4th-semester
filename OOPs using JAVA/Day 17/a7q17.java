// Q17. Write a Java Program to Search Last Occurance of a Substring Inside a Substring.

import java.util.*;
//Author : Abhishek Sharma
public class q17 {
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello Reader";
        int lastIndex = strOrig.lastIndexOf("Hello");
        if(lastIndex == - 1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Last occurrence of Hello is at index "+ lastIndex);
        }
    }
} 

/*
Output :
Last occurrence of Hello is at index 13
*/
