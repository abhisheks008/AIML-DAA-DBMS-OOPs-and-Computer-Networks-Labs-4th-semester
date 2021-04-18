// Q42. Write a Java Program to Count the Number of Occurrence of Each Character Ignoring the Case of Alphabets & Display them. 
import java.util.*;
//Author : Abhishek Sharma
import java.io.*;

class q42 {
    static void characterCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap
            = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args)
    {
        String str = "abhishek sharma";
        characterCount(str);
    }
}

/*
Output :
a 3
b 1
r 1
s 2
e 1
h 3
i 1
k 1
m 1
*/
