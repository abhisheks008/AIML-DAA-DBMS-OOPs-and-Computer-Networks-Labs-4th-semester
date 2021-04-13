// Q2. Design a palindrome class that will input a string from console and check whether the string is palindrome or not

import java.util.*;
//Author : Abhishek Sharma
public class q2 {
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        if (isPalindrome(str))
            System.out.println("Yes, " + str + " is Palindrome");
        else
            System.out.println("No, " + str + " is not Palindrome");
    }
}

/*
Output :
Enter the string : abba
Yes, abba is Palindrome
*/
