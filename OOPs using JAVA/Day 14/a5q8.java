// Q8. Create a base class Building that stores the number of floors of a building, number of rooms and it’s total footage. Create a derived class House that inherits Building and also stores the number of bedrooms and bathrooms. Demonstrate the working of the classes.
// Author : Abhishek Sharma

import java.io.*;
import java.lang.*;
import java.util.*;

class building {
    public void print_value()
    {
        int floor = 5;
        int room = 25;
        int footage = 4500;
        System.out.println("No. of Floors : "+floor);
        System.out.println("No of rooms : "+room);
        System.out.println("Total footage : "+ footage + " sq. ft.");
    }
}

class house extends building {
    public void print_house() 
    { 
        int bedroom = 16;
        int bathroom = 10;
        System.out.println("No. of bedrooms : " + bedroom);
        System.out.println("No. of bathrooms : " + bathroom);
    }
}

public class q8 {
    public static void main(String[] args)
    {
        house g = new house();
        g.print_value();
        g.print_house();
    }
}

/*
Output :
No. of Floors : 5
No of rooms : 25
Total footage : 4500 sq. ft.
No. of bedrooms : 16
No. of bathrooms : 10
*/
