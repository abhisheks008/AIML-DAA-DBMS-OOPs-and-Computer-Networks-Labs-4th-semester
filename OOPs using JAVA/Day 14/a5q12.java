// Q12. Combine Question number 10 and 11 and have all the three classes together. Now describe the working of all classes. 

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

class HexNum extends OctNum{
    public void showNum (int n){
        System.out.println("Hexadecimal value : " + Integer.toHexString(n));
    }
}

public class q12 {
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
        HexNum g2 = new HexNum();
        g2.showNum(n);
    }
}

/*
Output :
Enter the number : 11

You have entered : 11
Octal value : 13
Hexadecimal value : b
*/
