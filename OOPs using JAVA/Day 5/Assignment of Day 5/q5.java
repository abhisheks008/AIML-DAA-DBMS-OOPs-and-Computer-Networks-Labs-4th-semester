// Write a Java Program to find the area and perimeter of the rectangle.

import java.util.*;

public class q5 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of the rectangle : ");
        float l = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle : ");
        float b = sc.nextFloat();
        float area = l*b;
        float peri = 2*(l+b);
        
        System.out.println("Area of the rectangle = " + area);
        System.out.println("Perimeter of the rectangle = " + peri);

    }
}
