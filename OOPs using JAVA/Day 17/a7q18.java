// Q18. Write a Java Program to Remove a Particular Character from a String.
import java.util.*;
//Author : Abhishek Sharma
public class q18 {  
    public static void main(String[] args) {  
        String str = "India is my country";  
        System.out.println(charRemoveAt(str, 7));  
    }  
    public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
    }  
} 

/*
Output :
India i my country
*/
