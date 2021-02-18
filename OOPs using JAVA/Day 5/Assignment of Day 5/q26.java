// Write a Java program to count the number of digits in an integer.


import java.util.*;
// Author : Abhishek Sharma
public class q26 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
    System.out.println("Number of digits: " + count);
    }
}



// Output :
// Enter the number : 5478954
// Number of digits: 7
