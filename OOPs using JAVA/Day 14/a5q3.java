// Q3. Write a Java program to show method overriding. 
// Author : Abhishek Sharma

class Vehicle{  
    void run()
    {
        System.out.println("Vehicle is running");
    }  
}  
  class Bike extends Vehicle{  
    public static void main(String args[]){  
    Bike obj = new Bike();  
    obj.run();  
    }  
}

// Output :
// Vehicle is running
