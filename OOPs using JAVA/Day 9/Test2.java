class A{
    A() {System.out.println("hello a");}
    A(int x){
        this();
        System.out.println(x);
        // this();
    }
}
class Test2{
    public static void main(String args[]) {
        A a = new A(10);
    }
}

// here the output shows that 
// hello x
// 10
// hence it shows the correct usage  of the 'this' keyword