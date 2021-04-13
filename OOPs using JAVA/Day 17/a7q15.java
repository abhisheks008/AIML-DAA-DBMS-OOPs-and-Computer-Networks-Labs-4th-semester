// Q15. With a Java Program to Use compareToIgnoreCase Method In a String Class.

import java.util.*;
//Author : Abhishek Sharma
public class q15 {

    public static void main(String args[]) {
       String str1 = "Strings are immutable";
       String str2 = "Strings are immutable";
       String str3 = "Integers are not immutable";
       int result = str1.compareToIgnoreCase( str2 );
       System.out.println(result);
       result = str2.compareToIgnoreCase( str3 );
       System.out.println(result);
       result = str3.compareToIgnoreCase( str1 );
       System.out.println(result);
    }
}

/*
Output :
0
10
-10
*/
