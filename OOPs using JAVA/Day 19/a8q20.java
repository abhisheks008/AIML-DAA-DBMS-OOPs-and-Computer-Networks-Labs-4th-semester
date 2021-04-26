// 20. Write a program to accept a password from the user and throw 'Authentication Failure' exception if the password is incorrect. 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class AuthenticationFailure extends Exception{
    AuthenticationFailure(){
        super("AuthenticationFailure");
    }
}
public class q20 {
    public static void main(String arrg[]){
        String pass="UEMKCSEJAVA";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password :");
        String str=sc.next();
        if(str.equals(pass))
            System.out.println("Password Matched");
        else
            try {
                throw new AuthenticationFailure();
            }
            catch (AuthenticationFailure e) {
                System.out.print(e);
            }
    }
}

/*
Output :
Enter the password :
UEMKCSEJAVA
Password Matched

Enter the password :
KOLKATAJAVA
AuthenticationFailure: AuthenticationFailure
*/
