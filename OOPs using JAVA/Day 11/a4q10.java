// 10. Write a program to define a class 'employee' with data members as empid, name and salary. Accept data for 5 objects using Array of objects and print it. 
// Author : Abhishek Sharma


import java.util.*; 
class Item1{
   int p,eid; String c;
   Item1(String m,int n,int e){
      c=m; 
      p=n; 
      eid=e;
   }
   void display(){
      System.out.print(eid+" "+c + " " + p); 
      System.out.println();
   }
}
public class q10{
   public static void main(String args[]){
      Scanner sc= new Scanner(System.in); 
      int b,c;
      String a;
      Item1[] obj=new Item1[5]; 
      for(int i=0;i<5;i++){
         System.out.print("Enter ID : "); 
         c=sc.nextInt(); 
         System.out.print("Enter name : "); 
         a=sc.nextLine();
         a=sc.nextLine(); 
         System.out.print("Enter salary : "); 
         b=sc.nextInt();
         obj[i]=new Item1(a,b,c);
      }
      System.out.println("Employee ID Name Salary "); 
      for(int i=0;i<5;i++){
         obj[i].display();
      }
   }
}


/*
Output :
Enter ID : 1
Enter name : Abhishek
Enter salary : 45000 
Enter ID : 2
Enter name : Sayan
Enter salary : 45000
Enter ID : 3
Enter name : Nabarun
Enter salary : 50000
Enter ID : 4
Enter name : Subha
Enter salary : 46000
Enter ID : 5
Enter name : Mama
Enter salary : 56000

Employee ID Name Salary 
1 Abhishek 45000
2 Sayan 45000
3 Nabarun 50000
4 Subha 46000
5 Mama 56000
*/
