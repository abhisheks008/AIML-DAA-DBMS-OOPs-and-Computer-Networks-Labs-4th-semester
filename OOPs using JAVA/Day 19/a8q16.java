/*
16. Write a Java Program to Create Account with 500 Rs Minimum Balance, Deposit Amount, Withdraw Amount and Also Throws LessBalanceException. 
• Java Program Which has a Class Called LessBalanceException Which returns the Statement that Says WithDraw Amount(_Rs) is Not Valid 
• Java Program that has a Class Which Creates 2 Accounts, Both Account Deposit Money and One Account Tries to WithDraw more Money Which Generates a LessBalanceException Take Appropriate Action for the Same. 
*/
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class LessBalanceException extends Exception{
    LessBalanceException(int i){
        super("WithDraw Amount "+i+" is not valid");
    }
}
public class q16 {
    public static void main(String[] args) {
        int am=500;
        System.out.println("Account created with initial balance 500");
        int x=0;
        Scanner sc=new Scanner(System.in);
        while(x!=1){
            System.out.println("1. Diposit");
            System.out.println("2. Withdraw");
            int a=sc.nextInt();
            if(a==1){
                System.out.println("Enter the ammount");
                int z=sc.nextInt();
                am+=z;
                System.out.println("Current balance :"+am);
            }
            else if(a==2){
                System.out.println("Enter the ammount");
                int z=sc.nextInt();
                if(z>am)
                    try {
                        throw new LessBalanceException(z);
                    } 
                    catch (LessBalanceException e) {
                        System.out.println(e);
                    }
                else
                    am-=z;
                System.out.println("Current balance :"+am);
            }
            else{
                x = 1;
            }
        }
    }
}

/*
Output :
Account created with initial balance 500
1. Diposit
2. Withdraw
1
Enter the ammount
1000
Current balance :1500
1. Diposit
2. Withdraw
2
Enter the ammount
200
Current balance :1300
1. Diposit
2. Withdraw
2
Enter the ammount
2000
LessBalanceException: WithDraw Amount 2000 is not valid
Current balance :1300
*/
