// 12. Write a program which will accept an integer from the user and pass the value to a method called PrintNumberInWord that will print "ONE", "TWO",... , "NINE", "ZERO" if the integer variable "number" is 1, 2,... , 9, or 0, respectively. 
// Author : Abhishek Sharma


import java.util.Scanner; 
class number{
   public static void numberToWord(int num, String val) {
      String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE"," TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN" };      
      String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
      if (num > 19) {
         System.out.print(tens[num / 10] + " " + ones[num % 10]);
      } 
      else {
         System.out.print(ones[num]);
      }
      if (num > 0) { 
         System.out.print(val);
      }
   }
}
public class q12{
   public static void main(String[] args) { 
      int number = 0;
      Scanner scanner = new Scanner(System.in); 
      number n=new number();
      System.out.print("Please type a number between 0 and 999 OR type -1 to exit : "); 
      number = scanner.nextInt();
      while(number!=-1){
      if(number>=0 && number<=999){ if(number==0){
         System.out.print("NUMBER AFTER CONVERSION:\tZERO");
      } 
      else {
         System.out.print("NUMBER AFTER CONVERSION:\t"); 
         n.numberToWord(((number / 100) % 10), " HUNDRED");
         n.numberToWord((number % 100), " ");
      }
   } 
   else{
      System.out.print("NUMBER OUT OF RANGE");
   }
      System.out.print("\nPlease type a number between 0 and 999 OR type -1 to exit: "); number = scanner.nextInt();
      }
   }
}


/*
Output :
Please type a number between 0 and 999 OR type -1 to exit : 205
NUMBER AFTER CONVERSION:         TWO HUNDRED FIVE 
Please type a number between 0 and 999 OR type -1 to exit: 589
NUMBER AFTER CONVERSION:         FIVE HUNDRED EIGHTY  NINE 
Please type a number between 0 and 999 OR type -1 to exit: 647
NUMBER AFTER CONVERSION:         SIX HUNDRED FOURTY  SEVEN 
Please type a number between 0 and 999 OR type -1 to exit: -1
*/
