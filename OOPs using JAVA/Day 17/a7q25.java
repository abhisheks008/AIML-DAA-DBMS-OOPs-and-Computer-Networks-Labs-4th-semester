// Q25. Write a Java Program to Make First Character of Each Word in Uppercase

import java.util.*;
//Author : Abhishek Sharma
public class q25 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Input a Sentence: ");
    String line = in.nextLine();
    String upper_case_line = ""; 
        Scanner lineScan = new Scanner(line); 
        while(lineScan.hasNext()) {
            String word = lineScan.next(); 
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
        }
     System.out.println(upper_case_line.trim()); 
   }
}

/*
Output :
Input a Sentence: my name is abhishek sharma
My Name Is Abhishek Sharma
*/
