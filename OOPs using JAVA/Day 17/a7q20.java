// Q20. Write a Java Program to Reverse a String.
import java.util.*;
//Author : Abhishek Sharma
class q20{
  public static void main(String args[]){
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + original.charAt(i);
        System.out.println("Reverse of the string: " + reverse);
    }
}
/*
Output :
Enter a string to reverse
Abhishek
Reverse of the string: kehsihbA
*/
