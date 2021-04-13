// Q4. Write a Java program for reverse a string. (String will be taken as user input through console).

import java.util.*;
//Author : Abhishek Sharma
class q4{
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
