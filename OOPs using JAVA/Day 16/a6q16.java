// Q16. Program to implement the Multiple Inheritance (Exam Interface, Student & Result classes).
// @Abhishek Sharma
interface Exam{
    abstract public String markSheet();
}
class Student_Exam{
    protected String name;
    public Student_Exam(String name) {
        super();
        this.name = name;
    }
    public void get()
    {

    }
}
class Results extends Student_Exam implements Exam{
    int percent;
    public Results(String name, int percent) {
        super(name); 
        this.percent = percent;
    }
    public String markSheet() {
        return "Result [percentage=" + percent + ", name=" + name + "]";
    }
}
public class q1 {
    public static void main(String[] args) {
        Exam obj=new Results("Abhishek",97); 
        System.out.println(obj.markSheet());
    }
}

// Output :
// Result [percentage=97, name=Abhishek]
