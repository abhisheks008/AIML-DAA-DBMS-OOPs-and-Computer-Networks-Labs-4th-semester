// 18. Write a program to demonstrate use of 'this' keyword.
// Author : Abhishek Sharma


class Student1{
   int rollno; 
   String name; 
   float fee;
   Student1(int rollno,String name,float fee){ 
      this.rollno=rollno; 
      this.name=name;
      this.fee=fee;
   }
   void display(){
      System.out.println(rollno+" "+name+" "+fee);
   }
}
public class q18{
   public static void main(String args[]){
      Student1 s1=new Student1(100,"Abhishek Sharma",3000f); 
      Student1 s2=new Student1(101,"Sayan Mukherjee",2000f); 
      s1.display();
      s2.display();
   }
}

/*
Output :
100 Abhishek Sharma 3000.0
101 Sayan Mukherjee 2000.0 
*/
