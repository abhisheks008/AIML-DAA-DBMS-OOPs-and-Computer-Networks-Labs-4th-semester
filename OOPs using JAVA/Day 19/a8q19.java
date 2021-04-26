// 19. Write a program to raise a user defined exception if username is less than 6 characters and password does not match. 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class PasswordException extends Exception{
    PasswordException(String s){
        super(s);
    }
}
public class q19 {
    public static void main(String arrg[]){
        String pass="UEMKCSEJAVA";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the username :");
        String user1=sc.next();
        if(user1.length()<6)
            try {
                throw new PasswordException("Length is less than 6");
            }    
            catch (PasswordException e) {
                System.out.print(e);
            }
        System.out.print("Enter the password :");
        String str=sc.next();
        if(str.equals(pass))
            System.out.print("Password Matched");
        else
            try {
                throw new PasswordException("Wrong Password");
            } 
            catch (PasswordException e) {
                System.out.print(e);
            }
    }   
}

/*
Output :
Enter the username :CSE
PasswordException: Length is less than 6Enter the password :CSE00
PasswordException: Wrong Password

Enter the username :ABHISHEK
Enter the password :UEMKCSEJAVA
Password Matched
*/
