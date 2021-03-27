// Q9. In the earlier program, create a second derived class Office that inherits Building and stores the number of telephones and tables. Now demonstrate the working of all three classes.
// Author : Abhishek Sharma

import java.io.*;
import java.lang.*;
import java.util.*;

class building1 {
    public void print_building()
    {
        int floor = 5;
        int room  = 25;
        int footage = 7500;
        System.out.println("No of floor : " + floor + "\nNo. of rooms : " + room + "\nTotal footage = " + footage + " sq. ft.");
    }
}

class house1 extends building1 {
    int bedroom = 10;
    int bathroom = 12;
    public void print_house() 
    { 
        System.out.println("No of bedrooms : " + bedroom + "\nNo. of bathrooms : " + bathroom ); 
    }
}

class office extends house1 {
    public void print_office()
    {
        int telephone = 40;
        int table = 12;
        System.out.println("No of telephones : " + telephone + "\nNo. of tables : " + table );
    }
}
public class q9 {
    public static void main(String[] args)
    {
        office g = new office();
        g.print_building();
        g.print_house();
        g.print_office();
    }
}

/*
Output :
No of floor : 5
No. of rooms : 25
Total footage = 7500 sq. ft.
No of bedrooms : 10
No. of bathrooms : 12
No of telephones : 40
No. of tables : 12
*/
