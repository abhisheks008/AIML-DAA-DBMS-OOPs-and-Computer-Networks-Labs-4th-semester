// Write a Java Program to find the LCM of two numbers.


import java.util.*;
// Author : Abhishek Sharma
public class q25 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        
	 System.out.print("Enter second number : ");
        b = sc.nextInt();

        int lcm = (a > b) ? a : b;
        while(true) {
            if( lcm % a == 0 && lcm % b == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
                break;
             }
            ++lcm;
        }
    }
}



// Output :
// Enter first number : 5
// Enter second number : 7
// The LCM of 5 and 7 is 35.
