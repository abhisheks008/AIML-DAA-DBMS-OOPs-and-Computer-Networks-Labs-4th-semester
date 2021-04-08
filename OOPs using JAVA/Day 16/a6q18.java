// Q18. Java program to Perform Payroll Using Interface (Multiple Inheritance).
// @Abhishek Sharma
import java.lang.*; 
 
interface Gross 
{
    double ta=800.0;
    double da=1500.0; 
    void gross_sal();
}
 
class Employee2
{
    String name; 
    float basic_sal;
 
    Employee2(String n, float b) 
    {
        name=n;
        basic_sal=b;
    }
 
    void display() 
    {
        System.out.println("Name of Employee : "+name);
        System.out.println("Basic Salary of Employee : "+basic_sal);
    }
}
 
class Salary extends Employee2 implements Gross {
    float hra;
 
    Salary(String n, float b, float h){
        super(n,b);
        hra=h;
    }
 
    void disp()
    {
        display();
        System.out.println("HRA of Employee : "+hra);
    }
 
    public void gross_sal() 
    {
        double gross_sal=basic_sal + ta + da + hra;
        System.out.println("TA of Employee : "+ta);
        System.out.println("DA of Employee : "+da);
        System.out.println("Gross Salary of Employee : "+gross_sal);
    }
}
 
public class q1 {
 
    public static void main(String args[]) 
    {
        Salary s = new Salary("Sachin",8000,3000); 
        s.disp(); 
        s.gross_sal();
    }
}

/*
Output :
Name of Employee : Sachin
Basic Salary of Employee : 8000.0
HRA of Employee : 3000.0
TA of Employee : 800.0
DA of Employee : 1500.0
Gross Salary of Employee : 13300.0
*/
