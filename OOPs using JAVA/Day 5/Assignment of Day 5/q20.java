// Write a Java Program to find all the roots of a quadratic equation.


import java.util.*;
// Author : Abhishek Sharma
public class q20 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println ("Enter the coefficients in the following format of ax^2 + bx + c");
       System.out.print("Enter the value of a : ");
       double a = sc.nextDouble();
       System.out.print("Enter the value of b : ");
       double b = sc.nextDouble();
       System.out.print("Enter the value of c : ");
       double c = sc.nextDouble();
      double root1, root2;

      double determinant = (b * b) - (4 * a * c);
      if (determinant > 0) {
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);
  
        System.out.format("root1 = %.2f and root2 = %.2f\n", root1, root2);
      }
      else if (determinant == 0) {
        root1 = root2 = -b / (2 * a);
        System.out.format("root1 = root2 = %.2f;\n", root1);
      }
      else {
        double real = -b / (2 * a);
        double imaginary = Math.sqrt(-determinant) / (2 * a);
        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
        System.out.format("\nroot2 = %.2f-%.2fi\n", real, imaginary);
      }
    }
  }



// Output :
// Enter the coefficients in the following format of ax^2 + bx + c
// Enter the value of a : 1
// Enter the value of b : -5
// Enter the value of c : -14
// root1 = 7.00 and root2 = -2.00
