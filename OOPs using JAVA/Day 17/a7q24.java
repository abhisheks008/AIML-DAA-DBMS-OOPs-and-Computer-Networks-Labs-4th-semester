// Q24. Write a Java Program to Replace All Occurings of a String
import java.util.*;
//Author : Abhishek Sharma
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class q24 {
   public static void main(String args[]) {
      Pattern p = Pattern.compile("Abhishek");
      String instring = "Abhishek Abhishek Abhishek.";
      System.out.println("initial String: "+ instring);
      Matcher m = p.matcher(instring);
      String tmp = m.replaceAll("Engineer");
      System.out.println("String after replacing 1st Match: "+tmp);
   }
}

/*
Output :
initial String: Abhishek Abhishek Abhishek.
String after replacing 1st Match: Engineer Engineer Engineer.
*/
