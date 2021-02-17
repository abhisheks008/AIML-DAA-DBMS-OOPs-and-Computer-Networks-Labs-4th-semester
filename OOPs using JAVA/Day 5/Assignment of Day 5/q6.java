// Write a Java Program to find the area and perimeter of a circle.

import java.util.*;
public class q6 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of the circle : ");
        float r = sc.nextFloat();
        double area = 3.14*r*r;
        double peri = 2*3.14*r;
        System.out.println("Area of the circle = " + area);
        System.out.println("Perimeter of the circle = " + peri);
    }
}
