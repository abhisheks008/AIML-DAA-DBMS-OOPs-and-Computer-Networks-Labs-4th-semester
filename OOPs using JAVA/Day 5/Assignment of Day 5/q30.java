// Write a Java program to convert from binary to decimal and decimal to binary.


import java.util.*;
// Author : Abhishek Sharma
public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("For conversion of binary to decimal choose 1 and for decimal to binary choose 2");
        System.out.print("Choose between 1 and 2 :");
        int choose = sc.nextInt();
        if (choose==1){
            System.out.print("Enter the binary number :");
            String n = sc.nextLine();
            int decimal = Integer.parseInt(n,2);
            System.out.println("Decimal value is : "+decimal);
        }
        else if (choose == 2){
            System.out.print("Enter the decimal number :");
            int n = sc.nextInt();
            String binary = Integer.toBinaryString(n);
            System.out.println("Binary value is : "+binary);
        }
        else {
            System.out.println("nvalid choice choose b/w 1 and 2");
        }
        
    }
}

// Output :
// For conversion of binary to decimal choose 1 and for decimal to binary choose 2
// Choose between 1 and 2 :2
// Enter the decimal number :5
// Binary value is : 101

// For conversion of binary to decimal choose 1 and for decimal to binary choose 2
// Choose between 1 and 2 :1
// Enter the binary number :1010
// Decimal value is : 10
