// Q30. Write a Java Program to Find the Consecutive Occurrence of any Vowel in a String. 
import java.util.*;
//Author : Abhishek Sharma
class q30
{
    static boolean is_vow(char c)
    {
        return (c == 'a') || (c == 'e') ||(c == 'i') || (c == 'o') || (c == 'u');
    }
    static void removeVowels(String str)
    {
        System.out.print(str.charAt(0));
        for (int i = 1;
                i < str.length(); i++)
            if ((!is_vow(str.charAt(i - 1))) ||
                (!is_vow(str.charAt(i))))
                System.out.print(str.charAt(i));
    }
    public static void main(String[] args)
    {
        String str = "aabbccddee";
        removeVowels(str);
    }
}

/*
Output :
abbccdde
*/
