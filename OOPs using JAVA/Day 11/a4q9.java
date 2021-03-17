// 9. Write a program to define a class Tender containing data members cost and company name. Accept data for five objects and display company name for which cost is minimum. 
// Author : Abhishek Sharma


import java.util.*; 
class Tender{
   int cost; 
   String name;
   Tender(String a,int b){
      name=a; 
      cost=b;
   }
   void display(){
      System.out.println(name+"\t"+cost);
   }
}
public class q9{
   public static void main(String args[]){
      int cost, k=-1; 
      String name;
      Scanner sc=new Scanner(System.in); 
      System.out.print("Enter the number of tenders : "); 
      int n=sc.nextInt();
      Tender obj[]=new Tender[n];
      for(int i=0;i<n;i++){
         System.out.print("Enter the Name of Company : ");
          name=sc.nextLine();
         name=sc.nextLine(); 
         System.out.print("Enter the Cost : ");
         cost=sc.nextInt();
         obj[i]=new Tender(name,cost);
      }
      System.out.println("Company Name Cost"); 
      for(int i=0;i<n;i++){
         obj[i].display();
      }
      int min=obj[0].cost; 
      for(int i=1;i<n;i++){
         if(obj[i].cost<min){
            k=i; 
            min=obj[i].cost;
         }
      }
      System.out.println("Minimum = "+min);
   }
}

/*
Output :
Enter the number of tenders : 3
Enter the Name of Company : NCB
Enter the Cost : 56000
Enter the Name of Company : BMC
Enter the Cost : 75000
Enter the Name of Company : CID
Enter the Cost : 15000

Company Name Cost
NCB     56000
BMC     75000
CID     15000
Minimum = 15000
*/
