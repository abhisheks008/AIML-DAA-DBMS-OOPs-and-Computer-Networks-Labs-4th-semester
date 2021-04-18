// Q41. Write a Java Program to Check whether a Given Character is Present in a String, Find Frequency & Position of Occurrence. 
import java.util.*;
//Author : Abhishek Sharma
public class q41 {
    public static void main(String[] args) {
        String str = "This website is awesome.";
        char ch = 'e';
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}

/*
Output :
Frequency of e = 4
*/
