// 8. Write a program to define a class Item containing code and price. Accept this data for five objects using array of objects. Display code, price in tabular form and also, display total price of all items. 
// Author : Abhishek Sharma


import java.util.*; 
class Item{
   int price; int code;
   Item(int m,int n){
      code=m; price=n;
   }
   void display(){
      System.out.print(code+" "+price); 
      System.out.println();
   }
}
public class q8 {
   public static void main(String args[]) {
      Scanner sc= new Scanner(System.in); 
      int a,c,sum=0;
      Item[] obj=new Item[5]; 
      for(int i=0;i<5;i++){
         System.out.println("Enter Code :"); 
         c=sc.nextInt(); 
         System.out.println("Enter Price :"); 
         a=sc.nextInt();
         obj[i]=new Item(c,a);
      }
      for(int i=0;i<5;i++){
         sum=sum+obj[i].price;
      }
      System.out.println("Code Price "); 
      for(int i=0;i<5;i++){
         obj[i].display();
      }  
      System.out.println("Total Cost : " + sum);
   }
}


/*

Output :
Enter Code :
45
Enter Price :
566
Enter Code :
46
Enter Price :
899
Enter Code :
47
Enter Price :
547
Enter Code :
48
Enter Price :
235
Enter Code :
49
Enter Price :
599
Code Price 
45 566
46 899
47 547
48 235
49 599
Total Cost : 2846
*/
