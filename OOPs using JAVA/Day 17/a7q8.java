// Q8. Write a Java Program to Find All Possible Subsets of given Length in String
import java.util.*;
//Author : Abhishek Sharma
public class q8 {  
    public static void main(String[] args) {   
        String str = "ABHI";  
        int len = str.length();  
        int temp = 0;  
        String arr[] = new String[len*(len+1)/2];  
        for(int i = 0; i < len; i++) {  
            for(int j = i; j < len; j++) {  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }  
        System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  
    }  
}  

/*
Output :
All subsets for given string are:
A
AB
ABH
ABHI
B
BH
BHI
H
HI
I
*/
