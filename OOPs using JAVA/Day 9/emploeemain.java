// Global Variable and Local variable example
// Date : 03.03.2021 
// Author : Abhishek Sharma
// Example 1 : using of 'this' keyword

class employee {
    int eid ;
    void display(){
        eid = 102;
        System.out.println("Here's the id : "+ this.eid); // printing the global variable as 102
    }
}

public class emploeemain {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.eid = 105;
        e1.display();
    }
}


// Output : 
// Here's the id : 102