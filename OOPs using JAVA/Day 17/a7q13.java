// Q13. Write a Java Program to Use EqualsIgnoreCase Method In a String Class
import java.util.*;
//Author : Abhishek Sharma
public class q13{  
    public static void main(String args[]){  
        String s1="Abhishek";  
        String s2="Abhishek";  
        String s3="AbhiShek";  
        String s4="ABHISHEK";  
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}
/*
Output :
true
true
true
*/
