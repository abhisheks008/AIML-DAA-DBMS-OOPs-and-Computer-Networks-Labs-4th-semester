// Q34. Write a Java Program to Sort String Ignoring Whitespaces and Repeating Characters Only Once. 
import java.util.*;
//Author : Abhishek Sharma
import java.io.*;
class q34
{
    static void printStringAlternate(String str)
    {
        int[] occ = new int[122];
        String s = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            char temp = s.charAt(i);
            occ[temp]++;
            if (occ[temp]%2 != 0)
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main (String[] args)
    {
        String str1 = "My name is abhishek";
        printStringAlternate(str1);
    }
}

/*
Output :
My naeis bhk
*/
