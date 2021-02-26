// Global Variable and Local variable example 
// Author : Abhishek Sharma
// Example 4

class employee {
    int eid ;
    void display(){
        eid = 102;
        System.out.println("Here's the id : "+ eid);
    }
}

public class emploeemain {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.eid = 101;
        e1.display();
    }
}


// Output : 
// Here's the id : 102