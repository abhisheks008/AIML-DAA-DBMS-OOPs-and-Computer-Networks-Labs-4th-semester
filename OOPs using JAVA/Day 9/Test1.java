// proper use of this keyword in a JAVA program


class A{
    A() (System.out.println("hello a");)
    A(int x){
        // this()
        System.out.print(x);
        this();
    }
}
class Test1{
    public static void main(String args[]) {
        A a = new A(10);
    }
}

// it shows error and it shows that the 'this' keyword will be placed at the beginning of the classifier