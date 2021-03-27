/*
Q14. Create a base class called “vehicle” that stores number of wheels and speed. 
Create the following derived classes – 
“car” that inherits “vehicle” and also stores number of passengers. 
“truck” that inherits “vehicle” and also stores the load limit. 
Write a main function to create objects of these two derived classes and display all 
the information about “car” and “truck”. Also compare the speed of these two 
vehicles - car and truck and display which one is faster.
*/

import java.util.*;
// Author : Abhishek Sharma
class Vehicle{
    int wheels;
    double speed;
}

class Car extends Vehicle{
    int pass;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car's details:\nNo. of wheels:");
        wheels=sc.nextInt();
        System.out.println("Speed of Car(Km/hr):");
        speed=sc.nextDouble();
        System.out.println("No. of passengers:");
        pass=sc.nextInt();
    }

    void display(){
        System.out.println("No. of wheels:"+wheels+"\nSpeed:"+speed+"km/hr\nNo. of passengers:"+pass);
    }
}

class Truck extends Vehicle{
    double limit;
    void input()  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Truck's details:\nNo. of wheels:");
        wheels=sc.nextInt();
        System.out.println("Speed of Truck(Km/hr):");
        speed=sc.nextDouble();
        System.out.println("Load limit:");
        limit=sc.nextDouble();
    }

    void display()  {
        System.out.println("No. of wheels:"+wheels+"\nSpeed:"+speed+"km/hr\nLoad limit:"+limit);
    }
}

class q14{
    public static void main(String ts7[]){
        Car ob1= new Car();
        Truck ob2=new Truck();
        ob1.input();
        ob2.input();
        if(ob1.speed>ob2.speed)
            System.out.println("Car is faster");
        else
            System.out.println("Truck is faster");
        ob1.display();
        ob2.display();
    }
}

/*
Output :
Enter the car's details:
No. of wheels:
4
Speed of Car(Km/hr):
50
No. of passengers:
3
Enter the Truck's details:
No. of wheels:
6
Speed of Truck(Km/hr):
40
Load limit:
60
Car is faster
No. of wheels:4
Speed:50.0km/hr
No. of passengers:3
No. of wheels:6
Speed:40.0km/hr
Load limit:60.0
*/
