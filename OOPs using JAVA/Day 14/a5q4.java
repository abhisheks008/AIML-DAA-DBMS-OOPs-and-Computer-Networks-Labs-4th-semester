// Q4. Write a Java program to show method hiding. 
// Author : Abhishek Sharma

class Parent { 
    public static void sleep() {
      System.out.println("Sleeps at 11 PM");
    }
  }   
class Child extends Parent {   
    public static void sleep() {
      System.out.println("Sleeps at 9 PM");
    }
  }  
public class q1 {  
    public static void main(String[] args) {
      Parent p = new Parent();
      Parent c = new Child();
      p.sleep();
      c.sleep();   
    }
}


// Output :
// Sleeps at 11 PM
// Sleeps at 11 PM
