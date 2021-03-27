// Q6. Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private instance variables routeNumber in Bus and manufacturerName in Car and both of them having showData ( ) method showing all details of Bus and Car respectively with content of the super class’s showData ( ) method. 
// Author : Abhishek Sharma

class Vehicle_Main {
    protected int regnNumber; protected int speed; protected String color; protected String ownerName;
    public Vehicle_Main(int regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        }
    }
    class Bus extends Vehicle_Main{
    int routeNumber;
    public Bus(int regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }
    public String ShowData() {
        return "Bus [routeNumber = " + routeNumber + ", regnNumber = " + regnNumber + ", speed = " + speed + ", color = "+ color + ", ownerName = " + ownerName + "]";
        }
    }
    class Car extends Vehicle_Main{ String manufacturerName ;
    public Car(int regnNumber, int speed, String color, String ownerName, String manufacturerName ) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName ;
    }
    public String ShowData() {
        return "Car [manufacturerName = " + manufacturerName + ", regnNumber = " + regnNumber + ", speed = " + speed + ", color = " + color + ", ownerName = " + ownerName + "]";
        }
    }
public class q1 {
    public static void main(String args[]) {
        Bus obj=new Bus(1010,70,"Black","Abhishek Sharma",199); System.out.println(obj.ShowData());
        Car obj1=new Car(1010,70,"Black","Abhishek Sharma","TATA"); System.out.println(obj1.ShowData());
    }   
}



/*
Output :
Bus [routeNumber = 199, regnNumber = 1010, speed = 70, color = Black, ownerName = Abhishek Sharma]
Car [manufacturerName = TATA, regnNumber = 1010, speed = 70, color = Black, ownerName = Abhishek Sharma]
*/
