// Author : Abhishek Sharma
// Object Oriented Programming using JAVA
// This keyword example 3

public class Test4 {

    String name;
    String schoolname;
    int rollno;

    Student (String name, String schoolname){
        this.name = name; // here 'this' reference is used
        schoolname = sname;
    }

    Student (String name, String sname, int rollno){
        this.name = name;
        schoolname = sname;
        this.rollno = rollno;
    }

    void details(){
        System.out.println(name + " " + schoolname + " " + rollno);
    }
    public static void main(String args[]){
        Student s1 = new Student("Riddhi", "DPS");
        Student s2 = new Student("Sid", "RKM");
        s1.details();
        s2.details();
    }
}
