// 21. Write a program to input name and age of a person and throw a user-defined exception, if the entered age is negative. 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class NegAgeException extends Exception{
    NegAgeException(){
        super("Age should'nt be negetive");
    }
}
public class q21 {
    public static void main(String arrg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name :");
        String user1=sc.next();
        System.out.println("Enter the age :");
        int age=sc.nextInt();
        if(age<0)
            try {
                throw new NegAgeException();
            } 
            catch (NegAgeException e) {
                System.out.print(e);
            }
    }
}

/*
Output :
Enter the name :Abhishek
Enter the age :
-21
NegAgeException: Age should'nt be negetive

Enter the name :Sayan
Enter the age :
21
*/
