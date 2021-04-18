// Q37. Write a Java Program to Access the Index of the Character or String. 
import java.util.*;
//Author : Abhishek Sharma
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q37{  
    public static void main(String args[]){  
    String s1="this is index of example";  
    int index1=s1.indexOf("is");
    int index2=s1.indexOf("index");
    System.out.println(index1+"  "+index2);
    int index3=s1.indexOf("is",4);
    System.out.println(index3);
    int index4=s1.indexOf('s');
    System.out.println(index4); 
    }
}  

/*
Output :
2  8
5
3
*/
