// 20. Write a program to accept value of apple sales for each day of the week (using array of type float) and then, calculate the average sale of the week. 
// Author : Abhishek Sharma


class Sales{
   int x;
   Double sum=0.0,avg;
   void week(double[] sales){
      for(int i=1;i<=7;i++) { 
         sum=sum+sales[i-1];
      }
      System.out.println ("Sum = "+sum); avg=sum/7.0;
      System.out.println ("Average sale of week = "+avg);
   }
}
public class q20{
   public static void main(String[] args) { 
      Sales obj=new Sales();
      double[] sales={189.5,204.3,123.8,223.7,399.6,566.3,992.2};
      obj.week(sales);
   }
}

/*
Output :
Sum = 2699.4
Average sale of week = 385.62857142857143
*/
