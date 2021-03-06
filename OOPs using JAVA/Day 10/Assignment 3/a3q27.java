// Write a class, Commission, which has an instance variable, sales; an appropriate constructor; and a method, commission() that returns the commission. 
 
// Now write a demo class to test the Commission class by reading a sale from the user, using it to create a Commission object after validating that the value is not negative. Finally, call the commission() method to get and print the commission. If the sales are negative, your demo should print the message “Invalid Input”.

import java.util.Scanner;
// Author : Abhishek Sharma
class Commission {
    public int s;
    public int marks;
    public int m;
    public static void commission(int s){
        double count = s*100.00;
        System.out.println("Your sales amount is : "+s);
        System.out.println("As per the regulation per sale provides Rs. 100.00");
        System.out.println("Your Commission amount is : Rs."+count);
    }

    public static void demo(int marks){
        if (marks>=0){
            int m = marks;
            commission(m);
        }
        else {
            System.out.println("Invalid Input Given! Pls Check");
        }
    }
  
    public static void main(String[] args) {
        int sales;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount : ");
        sales = sc.nextInt();
        
        demo(sales);
    }
  }

/*
Output :
Enter the sales amount : 68
Your sales amount is : 68
As per the regulation per sale provides Rs. 100.00
Your Commission amount is : Rs.6800.0
*/
