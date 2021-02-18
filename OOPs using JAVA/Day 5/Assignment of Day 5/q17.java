// Write a java program for Fibonacci Series.


import java.util.*;
// Author : Abhishek Sharma
public class q17 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the range of the Fibonacci Series : ");
        int count = sc.nextInt();
        int a=0, b=1, c, i;
        System.out.print(a + " " + b);
        for (i=2; i<count; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.print("\n");
    }
}



// Output :
// Enter the range of the Fibonacci Series : 10
// 0 1 1 2 3 5 8 13 21 34
