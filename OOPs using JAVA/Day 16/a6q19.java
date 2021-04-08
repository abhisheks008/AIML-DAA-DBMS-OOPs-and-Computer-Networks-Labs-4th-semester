// implement the diagram below
// @Abhishek Sharma
interface Exam_{
    public void percentCall();
}
class Student_{
    protected String name; 
    protected int roll; 
    protected int marks1; 
    protected int marks2;
    public Student_(String name, int roll, int marks1, int marks2) {
        super();
        this.name = name; 
        this.roll = roll; 
        this.marks1 = marks1; 
        this.marks2 = marks2;
    }
    public String show() {
        return "Student [name=" + name + ", roll=" + roll + ", marks1=" + marks1 + ", marks2=" + marks2 + "]";
    }
}
class Result extends Student_ implements Exam_{
    int per;
    public Result(String name, int roll, int marks1, int marks2) {
        super(name, roll, marks1, marks2);
    }
    public void percentCall() {
        per=(marks1+marks2)/2; 
        System.out.println("Percentage :"+per);
    }
    public String display() {
        return "Result [percentage=" + per + ", name=" + name + ", roll=" + roll + ", marks1=" + marks1 + ", marks2=" + marks2 + "]";
    }
}
public class q1 {
    public static void main(String args[]) {
        Result obj=new Result("Abhishek",35,85,90); 
        obj.percentCall(); 
        System.out.println(obj.show()); 
        System.out.println(obj.display());
    }
}

/*
Output :
Percentage :87
Student [name=Abhishek, roll=35, marks1=85, marks2=90]
Result [percentage=87, name=Abhishek, roll=35, marks1=85, marks2=90]
*/
