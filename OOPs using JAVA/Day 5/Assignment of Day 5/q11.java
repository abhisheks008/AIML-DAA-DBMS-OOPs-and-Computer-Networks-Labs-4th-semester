// Write a java program to convert miles into km.


import java.util.*;
// Author : Abhishek Sharma
public class q11 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the distance in miles : ");
        float miles = sc.nextFloat();

        double km = miles * 1.609344;
        System.out.println ("The distance in kilometers : "+km);
    }
}


// Output :
// Enter the distance in miles : 60
// The distance in kilometers : 96.56064
