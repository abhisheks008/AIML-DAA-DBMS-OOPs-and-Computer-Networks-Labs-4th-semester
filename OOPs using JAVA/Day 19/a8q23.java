// 23. Write a program to throw a user-defined exception "String Mismatch Exception", if two strings are not equal (ignore the case). 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class StringMismatchException extends Exception{
    StringMismatchException (){
        super("StringMismatchException ");
    }
}
public class q23 {
    public static void main(String arrg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String :");
        String str=sc.next();
        System.out.println("Enter 2nd String :");
        String str1=sc.next();
        if(str.equals(str1))
            System.out.println("String Matched");
        else
        try {
            throw new StringMismatchException();
        } 
        catch (StringMismatchException e) {
            System.out.print(e);
        }
    }
}

/*
Output :
Enter 1st String :
Abhishek
Enter 2nd String :
Abhishek
String Matched

Enter 1st String :
Abhishek
Enter 2nd String :
Sharma
StringMismatchException: StringMismatchException
*/
