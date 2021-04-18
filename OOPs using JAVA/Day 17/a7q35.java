// Q35. Write a Java Program to Count Replace First Occurrence of a String. 
import java.util.*;
//Author : Abhishek Sharma
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q35 {
   public static void main(String args[]) {
      Pattern p = Pattern.compile("Abhishek");
      String instring = "Abhishek Abhishek Abhishek.";
      System.out.println("initial String: "+ instring);
      Matcher m = p.matcher(instring);
      String tmp = m.replaceFirst("Engineer");
      System.out.println("String after replacing 1st Match: " +tmp);
   }
}

/*
Output :
initial String: Abhishek Abhishek Abhishek.
String after replacing 1st Match: Engineer Abhishek Abhishek.
*/
