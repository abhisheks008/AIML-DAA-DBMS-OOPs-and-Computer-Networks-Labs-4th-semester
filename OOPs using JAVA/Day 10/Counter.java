public class Counter {
// Author : Abhishek Sharma
// Counter Variable using JAVA
    static int x = 0;
    Counter(){
        x++;
    }
    void display(){
        System.out.println(x);
    }

    public static void main (String args[]){

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c1.display();
        c2.display();
        c3.display();
    }
}

// Output : 
// 3
// 3
// 3