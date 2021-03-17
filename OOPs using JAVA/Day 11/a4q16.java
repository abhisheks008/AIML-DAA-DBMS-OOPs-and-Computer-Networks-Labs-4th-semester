// 16. Write a program that reads ten numbers, computes their average, and finds out how many numbers are above the average. [Use this keyword] 
// Author : Abhishek Sharma


import java.util.*;
class B{
   static int a[],n; 
   B(int a[],int n){
      this.a=a; 
      this.n=n;
   }  
   void calc(){
      int avg=0; int c=0;
      for(int i=0;i<n;i++)
         avg=avg+a[i];
      avg=avg/n; 
      System.out.println("Average is :"+avg); 
      for(int i=0;i<n;i++){
         if(a[i]>avg) c++;
      }
      if(c>0)
         System.out.println("There are "+c+" numbers that are above the average ");
      else
         System.out.println("There are no numbers that are below the average ");
   }
}

class q16{
   public static void main(String[] args) { 
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter n :");
      int n=sc.nextInt(); 
      int a[]=new int[n]; 
      for(int i=0;i<n;i++){
         System.out.println("Enter number :"); 
         a[i]=sc.nextInt();
      }
      B obj=new B(a,n); 
      obj.calc();
   }
}


/*
Output :
Enter n :
3
Enter number :
56
Enter number :
45
Enter number :
69
Average is :56
There are 1 numbers that are above the average
*/
