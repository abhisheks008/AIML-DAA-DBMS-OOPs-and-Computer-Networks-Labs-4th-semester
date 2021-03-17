// Create a “circle” class & a “point” class. The coordinates of the circle are given and used within the “circle” class as object of the “point” class. Display the area of circle. 
// Author : Abhishek Sharma

import java.util.*;
class circle{
   double rad;
   circle(point p1,point p2){
      this.rad=Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
   }  
   double display_area(){
      double area=(3.14*rad*rad); return area;
   }  
}
class point{
   int x,y;
   point(int x, int y){
      this.x=x; this.y=y;
   }
}
public class q1{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the x and y axis of two point"); 
      int a=sc.nextInt();
      int b=sc.nextInt(); 
      int c=sc.nextInt(); 
      int d=sc.nextInt();
      point p1=new point(a,b); 
      point p2=new point(c,d);
      circle mycircle=new circle(p1,p2); 
      double disp=mycircle.display_area();
      System.out.println("Area of the circle is: "+disp);
   }
}

/*
Output :
Enter the x and y axis of two point
4 5
6 7
Area of the circle is: 25.120000000000005
*/
