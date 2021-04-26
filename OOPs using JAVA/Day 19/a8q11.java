// 11. Write a java program to create an custom Exception that would handle at least 2 kind of Arithmetic Exceptions while calculating a given equation (e.g. X+Y*(P/Q)Z-I) 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class CustomArithmeticException extends Exception{
    CustomArithmeticException(String s){
        super(s);
    }
}
public class q11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y,p,q,z,l;
        System.out.println("Enter X");
        x=sc.nextInt();
        System.out.println("Enter Y");
        y=sc.nextInt();
        System.out.println("Enter P");
        p=sc.nextInt();
        System.out.println("Enter P");
        q=sc.nextInt();
        System.out.println("Enter Z");
        z=sc.nextInt();
        System.out.println("Enter L");
        l=sc.nextInt();
        try{
            if(q==0)
                throw new CustomArithmeticException("Cannot divided by 0");
            int sum=(x+y*(p/q)*z-l);
            if(sum<0)
                throw new CustomArithmeticException("Sum cannot be negetive");
            System.out.print(sum);
        }
        catch(CustomArithmeticException e){
            System.out.print(e);
        }
    }
}


/*
Output :
Enter X
12
Enter Y
10
Enter P
-5
Enter P
0
Enter Z
22
Enter L
10
CustomArithmeticException: Cannot divided by 0

Enter X
2
Enter Y
4
Enter P
6
Enter P
8
Enter Z
10
Enter L
12
CustomArithmeticException: Sum cannot be negetive
*/
