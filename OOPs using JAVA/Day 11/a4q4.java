// Write a program to define a class having one 3-digit number, num as data member. Initialize and display reverse of that number. 
// Author : Abhishek Sharma


import java.util.*; 
class Reverse{
   int num; 
   Reverse(int n) {
      num=n;
   }
   int rev(int num){
      int rev=0; 
      while(num>0){
         rev=rev*10+(num%10); 
         num=num/10;
      }
      return rev;
   }
}
public class q4 {
   public static void main(String args[]) {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter a number :"); 
      int b=sc.nextInt();
      Reverse a=new Reverse(b); 
      System.out.print("Reverse of "+b+" is : "); 
      int re=a.rev(b);
      System.out.println(re);
   }
}

/*
Output :
Enter a number :
568
Reverse of 568 is : 865
*/
