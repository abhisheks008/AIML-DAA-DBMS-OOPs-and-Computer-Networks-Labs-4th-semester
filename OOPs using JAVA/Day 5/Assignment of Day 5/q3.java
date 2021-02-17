// Write a Java program to convert from Celsius to Fahrenheit.

import java.util.*;

public class q3 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the temp. in Celsius :");
        float c = sc.nextFloat();
        float f;
        f = ((9*c)/5)-32;

        System.out.println("Temp. in Fahrenheit = " + f);

    }
}
