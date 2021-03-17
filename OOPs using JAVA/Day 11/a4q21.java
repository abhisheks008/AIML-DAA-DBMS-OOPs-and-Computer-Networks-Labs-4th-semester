// 21. Write program, which finds the sum of numbers formed by consecutive digits. Input : 2415 output : 24+41+15=80. 
// Author : Abhishek Sharma


import java.util.*; 
class Digit{
   int x;
   int y=0,z=0,sum=0,m=0; 
   Digit(int x){
      this.x=x;
   }
   void num(){
      while (x>9){
         y=x%10;
         x=x/10; 
         z=x%10;
         m=z*10; 
         sum=sum+y+m;
      }
      System.out.println("sum of numbers formed by consecutiv digits="+sum);
   }
}
public class q21{
   public static void main(String[] args) { 
      Scanner sc=new Scanner(System.in); 
      System.out.print("Enter a number:"); 
      int i=sc.nextInt();
      Digit obj=new Digit(i); 
      obj.num();
   }
}


/*
Output :
Enter a number : 2415
sum of numbers formed by consecutive digits = 80
*/
