// Q15. Program to create a interface 'Mango' and implement it in classes 'Winter' and 'Summer'.
// @Abhishek Sharma
interface Mango{
    abstract public String Availability();
}
class Summer implements Mango{
    boolean Availability ;
    public Summer(boolean availability) {
        Availability = availability;
    }
    public String Availability() {
        return "Summer [Availability=" + Availability + "]";
    }
}
class Winter implements Mango{
    boolean Availability ;
    public Winter(boolean availability) {
        Availability = availability;
    }
    public String Availability() {
        return "Winter [Availability=" + Availability + "]";
    }
}
public class q1 {
    public static void main(String args[]) {
        Mango obj=new Summer(true); 
        Mango obj1=new Winter(false); 
        System.out.println(obj.Availability()); 
        System.out.println(obj1.Availability());
    }
}
/*
Output :
Summer [Availability=true]
Winter [Availability=false]
*/
