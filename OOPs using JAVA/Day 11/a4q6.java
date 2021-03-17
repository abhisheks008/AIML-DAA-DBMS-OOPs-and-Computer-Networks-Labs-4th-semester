// 6. Write a program to define a class Employee to accept emp_id, emp _name, basic_salary from the user and display the gross_salary. 
// Author : Abhishek Sharma


import java.util.*;
class Employee {
   int emp_id;
   String emp_name; 
   float basic_salary;
   Employee(int emp_id, String emp_name, float basic_salary){
      this.emp_id=emp_id; 
      this.emp_name=emp_name; 
      this.basic_salary=basic_salary;
   }
   void display(){
      float da=basic_salary*15/100; float hra=basic_salary*10/100;
      float gross_sal=basic_salary+da+hra; System.out.println("\nYOUR DETAILS IS GIVEN BELOW : "); System.out.println ("Employee Id = "+emp_id); System.out.println ("Emplyee Name = "+emp_name); System.out.println ("Gross Salary = "+gross_sal);
   }
}
public class q6{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in); 
      System.out.println ("Enter Employee id"); 
      int id = sc.nextInt();
      System.out.println ("Enter Employee Name"); 
      String name = sc.nextLine();
      name = sc.nextLine();
      System.out.println ("Enter Basic Salary"); 
      float sal = sc.nextFloat();
      Employee e = new Employee(id, name, sal); 
      e.display();
   }
}


/*
Output :
Enter Employee id
451
Enter Employee Name
Abhishek Sharma
Enter Basic Salary
5000.00




YOUR DETAILS IS GIVEN BELOW :
Employee Id = 451
Emplyee Name = Abhishek Sharma
Gross Salary = 6250.0
*/
