// Q5. Create three interfaces, each with two methods. Inherit a new interface from the three, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. In main ( ), create an object of your class and pass it to each of the methods.
// @Abhishek Sharma

interface Test1{
    public void show1();
    public void show2();
}
interface Test2{
    public void show3();
    public void show4();
}
interface Test3{
    public void show5();
    public void show6();
}
interface Test4{
    public void show7();
    public void show8();
}
interface MultiTest extends Test1,Test2,Test3,Test4{
    public void newMethod();
}
class Multi implements MultiTest{
    public void show1() {
        System.out.println("Mehtod 1");
    }
    public void show2() {
        System.out.println("Mehtod 2");
    }
    public void show3() {
        System.out.println("Mehtod 3");
    }
    public void show4() {
        System.out.println("Mehtod 4");
    }
    public void show5() {
        System.out.println("Mehtod 5");
    }
    public void show6() {
        System.out.println("Mehtod 6");
    }
    public void show7() {
        System.out.println("Mehtod 7");
    }
    public void show8() {
        System.out.println("Mehtod 8");
    }
    public void newMethod() { 
        System.out.println("Mehtod newMethod()");
    }
}
public class q1 {
    public static void main(String args[]) {
        MultiTest obj=new Multi(); obj.show1();
        obj.show2();
        obj.show3();
        obj.show4();
        obj.show5();
        obj.show6();
        obj.show7();
        obj.show8(); obj.newMethod();
    }
}

/*
Output :
Mehtod 1
Mehtod 2
Mehtod 3
Mehtod 4
Mehtod 5
Mehtod 6
Mehtod 7
Mehtod 8
Mehtod newMethod()
*/
