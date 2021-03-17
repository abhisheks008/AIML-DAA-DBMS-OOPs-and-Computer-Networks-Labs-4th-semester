// Create a class called Complex, which has three private instance variables –real and imaginary. It contains a method called add( ) which takes one Complex object as parameter and print the added value of the calling Complex object and passes Complex object. In the main method, declare two Complex objects and assign values using constructor and call the add() method. 
// Author : Abhishek Sharma

import java. util.*;
class Complex {
   int real;
   int imaginary;
   Complex (int real, int imaginary)
   {
      this.real=real;; this.imaginary=imaginary;
   }
   void add(Complex op2){
      this.real=this.real+op2.real; 
      this.imaginary=this.imaginary+op2.imaginary;
   }
   void display()
   {
      System.out.println(" The value: " + real +" + " + imaginary+"i");
   }
}
public class q3
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the Real part of two numbers : "); 
      int r1=sc.nextInt();
      int r2=sc.nextInt();
      System.out.println("Enter the Imaginary part of two numbers : "); 
      int i1=sc.nextInt();
      int i2=sc.nextInt();
      Complex op=new Complex(r1,i1); 
      Complex op1=new Complex(r2,i2);
      System.out.println("Before add"); 
      op.display();
      op1.display(); 
      op.add(op1);
      System.out.println("After add"); 
      op.display();
   }
}



/*
Output :
Enter the Real part of two numbers : 
3 5
Enter the Imaginary part of two numbers : 
9 8
Before add
 The value: 3 + 9i
 The value: 5 + 8i
After add
 The value: 8 + 17i
*/
