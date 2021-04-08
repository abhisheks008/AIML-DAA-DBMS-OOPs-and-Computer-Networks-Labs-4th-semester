/*
Q6. Create an interface Department containing attributes deptName and deptHead. It also has abstract methods for printing the attributes. Create a class hostel containing hostelName, hostelLocation and numberofRooms. The class contains methods for getting and printing the attributes. Then write Student class extending the Hostel class and implementing the Department interface. This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and printData methods for this class. Also implement the abstract methods of the Department interface. Write a driver class to test the Student class. The program should be menu driven containing the options: 
i) Admit new student 
ii) Migrate a student 
iii) Display details of a student 
For the third option a search is to be made on the basis of the entered registration number. 
*/
// @Abhishek Sharma

import java.util.Scanner;
interface Department{
    public final String deptName="CSE";
    public final String deptHead="XYZ_Sir";
    public abstract String printData();
}
class Hostel{
    protected String hostelName,hostelLocation;
    protected int numberofRooms;
    public Hostel(String hostelName, String hostelLocation, int numberofRooms) {
        this.hostelName = hostelName; 
        this.hostelLocation = hostelLocation; 
        this.numberofRooms = numberofRooms;
    }
}
class Student extends Hostel implements Department{
    protected String studentName, regdNo, electiveSubject;
    protected int avgMarks;
    public Student(String hostelName, String hostelLocation, int numberofRooms, String studentName, String regdNo, String electiveSubject, int avgMarks) { super(hostelName, hostelLocation, numberofRooms); this.studentName = studentName;
        this.regdNo = regdNo; 
        this.electiveSubject = electiveSubject; 
        this.avgMarks = avgMarks;
    } 
    public String printData() {
        return "Student [studentName=" + studentName + ", regdNo=" + regdNo + ", electiveSubject=" + electiveSubject + ", avgMarks=" + avgMarks + ", hostelName=" + hostelName + ", hostelLocation=" + hostelLocation + ", numberofRooms=" + numberofRooms + ", deptName=" + deptName + ", deptHead=" + deptHead + "]";
    }
}

public class q6 {
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in);
        String studentName, regdNo, electiveSubject;
        int avgMarks,numberofRooms; 
        String hostelName,hostelLocation; 
        Student[] obj=new Student[10]; 
        int x=1,i=1;
        while(x!=0)
        {
            System.out.println("1: Admit"); 
            System.out.println("2: Migrate"); 
            System.out.println("3: Show"); 
            int z=sc.nextInt();
            if(z==1)
            {
                System.out.println("Enter Student Name"); 
                studentName=sc.next();
                regdNo="UEMK2NDCSE"+i; 
                System.out.println("Enter elected Subject"); 
                electiveSubject=sc.next(); 
                System.out.println("Enter avgMarks"); 
                avgMarks=sc.nextInt(); 
                System.out.println("Enter hostelName"); 
                hostelName=sc.next(); 
                System.out.println("Enter hostelLocation"); 
                hostelLocation=sc.next(); 
                System.out.println("Enter numberofRooms"); 
                numberofRooms=sc.nextInt();
                obj[i++]=new Student( hostelName, hostelLocation, numberofRooms, studentName, regdNo,electiveSubject, avgMarks);
                System.out.println("Student Added::Reg Id"+regdNo);
            }
            else if(z==2)
            {
                System.out.print("Enter the last digit of the id ");
                int o=sc.nextInt(); 
                obj[o]=null;
            }
            else if(z==3){
                System.out.print("Enter the last digit of the id "); 
                int o=sc.nextInt(); 
                System.out.println(obj[o].printData());
            }
            else
            {
                x=0;
            }
        }
    }
}

/*
Output :
1: Admit
2: Migrate
3: Show
1
Enter Student Name
Abhishek
Enter elected Subject
JAVA
Enter avgMarks
90
Enter hostelName
UEM_hostel
Enter hostelLocation
NewTown
Enter numberofRooms
1
Student Added::Reg IdUEMK2NDCSE1
1: Admit
2: Migrate
3: Show
3
Enter the last digit of the id 1
Student [studentName=Abhishek, regdNo=UEMK2NDCSE1, electiveSubject=JAVA, avgMarks=90, hostelName=UEM_hostel, hostelLocation=NewTown, numberofRooms=1, deptName=CSE, deptHead=XYZ_Sir]
*/
