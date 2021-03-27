// Q11. Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class OctNum which inherits Num and overrides shownum() which displays the octal value of the number. Demonstrate the working of the classes.
// Author : Abhishek Sharma

import java.io.*;
import java.lang.*;
import java.util.*;

class num {
    public void showNum(int n)
    {
        
        System.out.println("\nYou have entered : "+n);
    }
}

class OctNum extends num {
    public void showNum(int n) 
    {
        System.out.println("Octal value : " + Integer.toOctalString(n));
    }
}

public class q11 {
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num g1 = new num();
        g1.showNum(n);
        OctNum g = new OctNum();
        g.showNum(n);
    }
}

/*
Output :
Enter the number : 8

You have entered : 8
Octal value : 10
*/
