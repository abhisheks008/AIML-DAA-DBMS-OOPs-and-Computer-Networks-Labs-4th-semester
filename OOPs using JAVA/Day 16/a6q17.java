// Q17. Program to demonstrate use of hierarchical inheritance using interface.
// @Abhishek Sharma
interface A
{
    public void displayA();
}
interface B extends A
{
    public void displayB();
}
interface C extends A
{
    public void displayC();
}
class Hierarchy implements B,C{
    public void displayC() {
        System.out.println("Hi this is C");
    }
    public void displayB() {
        System.out.println("Hi this is B");
    }
    public void displayA() {
        System.out.println("Hi this is A");
    }
}
public class q1 {
    public static void main(String args[])
    {
        Hierarchy obj=new Hierarchy(); 
        obj.displayA();
        obj.displayB(); 
        obj.displayC();
    }
}

/*
Output :
Hi this is A
Hi this is B
Hi this is C
*/
