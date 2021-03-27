// Q10. Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class HexNum which inherits Num and overrides shownum() which displays the hexadecimal value of the number. Demonstrate the working of the classes.
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

class hexNum extends num {
    public void showNum(int n) 
    {
        System.out.println("Hexadecimal value : " + Integer.toHexString(n));
    }
}

public class q10 {
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num g1 = new num();
        g1.showNum(n);
        hexNum g = new hexNum();
        g.showNum(n);
    }
}

/*
Output :
Enter the number : 11

You have entered : 11
Hexadecimal value : b
*/
