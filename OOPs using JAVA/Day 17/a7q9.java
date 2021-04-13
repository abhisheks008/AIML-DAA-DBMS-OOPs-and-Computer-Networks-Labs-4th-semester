// Q9. Write a Java Program to Remove the White Spaces from a String.

import java.util.*;
//Author : Abhishek Sharma
public class q9 {  
    public static void main(String[] args) {  
        String str = "My name is Abhishek Sharma";  
        String noSpaceStr = str.replaceAll("\\s", ""); 
        System.out.println(noSpaceStr);   
    }  
} 

/*
Output :
MynameisAbhishekSharma
*/
