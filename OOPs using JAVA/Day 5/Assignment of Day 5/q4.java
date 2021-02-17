// Write a Java program to convert from Fahrenheit to Celsius

import java.util.*;

public class q4 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the temp. in Fahrenheit :");
        float f = sc.nextFloat();
        float c;
        c = (5*(f-32))/9;

        System.out.println("Temp. in Celsius = " + c);

    }
}
