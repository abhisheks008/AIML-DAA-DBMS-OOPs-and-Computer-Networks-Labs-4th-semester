// Q36. Write a Java Program to Know the Last Index of a Particular Word in a String. 
import java.util.*;
//Author : Abhishek Sharma
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q36{  
    public static void main(String args[]){  
    String s1="this is index of example";
    int index1=s1.lastIndexOf('s');
    System.out.println(index1);
    }
}

/*
Output :
6
*/
