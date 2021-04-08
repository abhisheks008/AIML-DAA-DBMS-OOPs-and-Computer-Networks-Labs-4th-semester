// Q1. Design an abstract class having two methods. Create Rectangle and Triangle classes by inheriting the shape class and override the above methods to suitably implement for Rectangle and Triangle class.
// @Abhishek Sharma
abstract class Area_Peri{
    public abstract int area(int w,int l);
    public abstract double perimeter(int a,int b);
}

class Rectangle extends Area_Peri{
    public int area(int w, int l) {
        return w*l;
    }
    public double perimeter(int w, int l) {
        return 2*(w+l);
    }
}

class Triangle extends Area_Peri{
    public int area(int h,int b) {
        return (h*b)/2;
    }
    public double perimeter(int h, int b) {
        return (h+h+b);
    }
} 

public class q1 {
    public static void main(String args[]) {
        Area_Peri obj=new Rectangle();
        System.out.println("Area of the Rectangle "+obj.area(10,20)); 
        System.out.println("perimeter of the Rectangle "+obj.perimeter(10,20));
        Area_Peri obj1=new Triangle();
        System.out.println("Area of the Triangle "+obj1.area(10,20)); 
        System.out.println("perimeter of the Triangle "+obj1.perimeter(20,10));
    }
}

/*
Output :
Area of the Rectangle 200
perimeter of the Rectangle 60.0
Area of the Triangle 100
perimeter of the Triangle 50.0
*/
