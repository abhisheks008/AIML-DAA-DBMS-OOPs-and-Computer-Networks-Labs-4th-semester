//Q2. Write a program in Java to illustrate the use of interface in Java.  
// @Abhishek Sharma

interface Example{
    public void show();
}
class Test_Example implements Example{
    public void show() {
        System.out.print("This is Interface");
    }
}
    
public class q2 {
    public static void main(String args[]) {
        Example obj=new Test_Example(); 
        obj.show();
    }
}

// Output :
// This is Interface
