// 2. Create a class called Time, which has three private instance variables – hour, min and sec. It contains a method called add( ) which takes one Time object as parameter and print the added value of the calling Time object and passes Time object. In the main method, declare two Time objects and assign values using constructor and call the add() method. 
// Author : Abhishek Sharma

import java.util.Scanner; 
class time{
   int hour,min,sec;
   time(int hour,int min, int sec){ 
      this.hour=hour; 
      this.min=min; 
      this.sec=sec;
   }
   void add_times(time mytime){ 
      int sec,hour,min; 
      sec=this.sec+mytime.sec; 
      if(sec>=60)
      {
         min=this.min+mytime.min+1; 
         sec=sec-60;
      }
      else 
         min=this.min+mytime.min; 
         if(min>=60)
         {
            hour=this.hour+mytime.hour+1; min=min-60;
         }
         else 
            hour=this.hour+mytime.hour;
      System.out.println("\nAdded Time is: "+hour+" hour "+min+" min "+sec+" sec ");
      }
   }
   public class q2{
      public static void main(String args[]){ 
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first Time int hh/mm/ss format : "); 
         int h1=sc.nextInt();
         int m1=sc.nextInt(); 
         int s1=sc.nextInt();
         System.out.println("Enter the second Time int hh/mm/ss format : "); 
         int h2=sc.nextInt();
         int m2=sc.nextInt(); 
         int s2=sc.nextInt();
         time t1=new time(h1,m1,s1); 
         time t2=new time(h2,m2,s2);
         System.out.println("\nTime t1 is : "+t1.hour+" hour "+t1.min+" min "+t1.sec+" sec"); 
         System.out.println("Time t2 is : "+t2.hour+" hour "+t2.min+" min " +t2.sec+" sec "); 
         t1.add_times(t2);
      }
   }

/*
Output :
Enter the first Time int hh/mm/ss format : 
1 20 56
Enter the second Time int hh/mm/ss format : 
2 35 45


Time t1 is : 1 hour 20 min 56 sec
Time t2 is : 2 hour 35 min 45 sec

Added Time is: 3 hour 56 min 41 sec
*/
