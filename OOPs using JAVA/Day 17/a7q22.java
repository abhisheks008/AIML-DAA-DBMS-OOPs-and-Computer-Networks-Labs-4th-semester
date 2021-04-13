// Q22. Write a Java Program to Split a String into a Number of Substrings
import java.util.*;
//Author : Abhishek Sharma
public class q22 {
    public static void main(String args[]) {
        String str = "jan-feb-march";
        String[] temp;
        String delimeter = "-";
        temp = str.split(delimeter);
        for (int i =0; i < temp.length ; i++) {
            System.out.println(temp[i]);
            System.out.println("");
            str = "jan.feb.march";
            delimeter = "\\.";
            temp = str.split(delimeter);
        }
        for (int i =0; i < temp.length ; i++) {
            System.out.println(temp[i]);
            System.out.println("");
            temp = str.split(delimeter,2);
            for (int j =0; j < temp.length ; j++) {
                System.out.println(temp[i]);
            }
        }
    }
}
/*
Output :
jan

feb

march

jan

jan
jan
feb.march

feb.march
feb.march
*/
