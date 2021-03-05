// Author : Abhishek Sharma
// Counter Object creation and using the method of static printing of variables

class Counter {
    int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }
}
public class Q1 {
    public static void main(String args[]){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

// Output :
// 1
// 1
// 1
