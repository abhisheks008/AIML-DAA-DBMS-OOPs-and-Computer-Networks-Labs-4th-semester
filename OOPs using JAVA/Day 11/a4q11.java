/*
11. Define a class called circle that contains: 
• Two private instance variables: radius (of type double) and color (of type String), 
• Initialize the variables radius and color with default value of 1.0 and "red", respectively using default constructor. 
• Include a second constructor that will use the default value for color and sets the 
radius to the value passed as parameter. 
• Two public methods: getRadius() and getArea() for returning the radius and area of 
the circle 
• Invoke the above methods and constructors in the main. 
*/
// Author : Abhishek Sharma



import java.util.*; 
class AB{
   private double radius; private String color; AB(){
      radius=1.0;
      color="red";
   }
   AB(double a,String col){
      radius=a; color=col;
   }
   double getRadius(){
      return radius;
   }
   double getArea(){
      double area=3.14*radius*radius; return area;
   }
}
public class q11{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the Radius:"); 
      double rad=sc.nextDouble(); 
      System.out.println("Enter the color:"); 
      String clr=sc.nextLine(); 
      clr=sc.nextLine();
      AB a=new AB();
      AB b=new AB(rad,clr); 
      double q=a.getRadius();
      System.out.println("Value of radius when we call getRadius() with non parameterized constructor = "+q);
      double g=b.getRadius();
      System.out.println("Value of radius when we call getRadius() with parameterized constructor = "+g);
      double ar=b.getArea(); 
      System.out.println("Area = "+ar); 
      System.out.println("Colour = "+clr);
   }
}


/*
Output :
Enter the Radius:
4.5
Enter the color:
Red  
Value of radius when we call getRadius() with non parameterized constructor = 1.0
Value of radius when we call getRadius() with parameterized constructor = 4.5
Area = 63.585
Colour = Red
*/
