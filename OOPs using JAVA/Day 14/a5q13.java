// Q13. Create a base class Distance which stores the distance between two locations in miles and a method travelTime(). The method prints the time taken to cover the distance when the speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() so that it prints the time assuming the distance is in kilometers and the speed is 100 km per second. Demonstrate the working of the classes.
// Author : Abhishek Sharma

import java.io.*;
import java.lang.*;
import java.util.*;

class distance {
    public void TravelTime(float n)
    { 
        double mtime = n/60;
        System.out.println("Time taken while travelling 60 miles/hr : "+ String.format("%.2f", mtime)+ " hours");
    }
}

class distanceMKS extends distance {

    public void TravelTime(float n) 
    {
        double km = n * 1.60934;
        double kmtime = km/100;
        System.out.println("Time taken while travelling 100 km/hr : " + String.format("%.2f", kmtime) + " hours");
    }
}

public class q13 {
    public static void main(String[] args)
    {
        float n;
        System.out.print("Enter the distance in miles : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextFloat();
        distance g1 = new distance();
        g1.TravelTime(n);
        distanceMKS g = new distanceMKS();
        g.TravelTime(n);
    }
}

/*
Output :
Enter the distance in miles : 100
Time taken while travelling 60 miles/hr : 1.67 hours
Time taken while travelling 100 km/hr : 1.61 hours
*/
