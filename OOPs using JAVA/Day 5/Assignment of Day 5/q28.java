// Write a Java program to check whether the number is palindrome or not.


import java.util.*;
// Author : Abhishek Sharma
public class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :");
        int x = sc.nextInt();
        int old = x;
        int r, sum=0;
        while (x>0){
            r = x%10;
            x = x/10;
            sum = sum*10 + r;
        }
        if (old == sum){
            System.out.printf("%d is Palindrome!\n", old);
        }
        else 
        System.out.printf("%d is not Palindrome!\n", old);

    }
}



// Output :
// Enter the number :585
// 585 is Palindrome!
