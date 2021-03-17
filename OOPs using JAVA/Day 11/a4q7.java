// 7. Write a program to define a class Fraction having data members numerator and denominator. Initialize three objects using different constructors and display its fractional value. 
// Author : Abhishek Sharma



import java.util.*;
class Fraction{
   double numerator,denominator; 
   Fraction (int a, double b){
      numerator=a; 
      denominator=b;
   }
   Fraction (int x, int y){
      numerator=x; 
      denominator=y;
   }
   Fraction(double m, double n){
      numerator=m; denominator=n;
   }
   void display(){
      double fraction=numerator/denominator; 
      System.out.println ("Fraction = "+fraction);
   }
}
public class q7{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the Numerator of three numbers:");
      int n1=sc.nextInt(); 
      int n2=sc.nextInt();
      double n3=sc.nextDouble();
      System.out.println("Enter the Denominator of three numbers:"); 
      double d1=sc.nextDouble();
      int d2=sc.nextInt();
      double d3=sc.nextDouble(); 
      Fraction f1 = new Fraction(n1,d1); 
      f1.display();
      Fraction f2 = new Fraction(n2,d2); 
      f2.display();
      Fraction f3 = new Fraction(n3,d3); 
      f3.display();
   }
}


/*
Output :
Enter the Numerator of three numbers:
1 2 3


Enter the Denominator of three numbers:
10 20 30
Fraction = 0.1
Fraction = 0.1
Fraction = 0.1
*/
