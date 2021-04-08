// Q13. Write a program to implement the Multiple Inheritance (Bank Interface, Customer & Account classes).
// @Abhishek Sharma
interface Bank{
    final String name="HDFC";
    public String details();
}
class Customer{
    protected String CustomerName;
    public Customer(String name) {
        super();
        this.CustomerName = name;
    }
}
class Account_Main extends Customer implements Bank{
    int acNo;
    public Account_Main(String name, int acNo) {
        super(name); this.acNo = acNo;
    }
    public String details() {
        return "Account [acNo=" + acNo + ", CustomerName=" + CustomerName + "]";
    }
}
public class q1 {
    public static void main(String args[]) {
        Bank obj=new Account_Main("Abhishek",12585550); 
        System.out.println(obj.details());
    }
}

// Output :
// Account [acNo=12585550, CustomerName=Abhishek]
