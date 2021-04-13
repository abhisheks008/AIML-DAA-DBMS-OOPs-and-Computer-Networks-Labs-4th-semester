// Q21. Write a Java Program to Search a Word Inside a String
import java.util.*;
//Author : Abhishek Sharma
public class q21 {
    public static void main(String[] args) {
        String strOrig = "My name is Abhishek Sharma";
        int intIndex = strOrig.indexOf("Abhishek");
        if(intIndex == - 1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index "+ intIndex);
        }
    }
}
/*
Output :
Found Abhishek at index 11
*/
