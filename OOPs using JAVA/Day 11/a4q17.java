// 17. Write a program that reads ten integers and displays them in the reverse of the order in which they were read. 
// Author : Abhishek Sharma


class Num{
   void rev(int[] num){
      System.out.println ("in reverse order"); 
      for(int i=9;i>=0;i--){ 
         System.out.print (num[i] + " ");
      }
   }
}
public class q17 {
   public static void main(String[] args){
      Num ob=new Num();
      int[] num={0,1,2,3,4,5,6,7,8,9};
      ob.rev(num);
   }
}

/*
Output :
in reverse order
9 8 7 6 5 4 3 2 1 0
*/
